package mw.domain

trait Orderable[A] {

  /***
    * l < r : negative
    * l = r : zero
    * l > r : positive
    */
  def compare(l: A, r: A): Int

  def <(l: A, r: A): Boolean = compare(l, r) < 0
}

object Orderable {

  implicit val intOrderable: Orderable[Int] = (l: Int, r: Int) => l - r

  implicit val stringOrderable: Orderable[String] =
    (l: String, r: String) =>
      if (l == r) 0
      else if (l < r) -1
      else 1

  def by[A, B](f: A => B)(implicit order: Orderable[B]): Orderable[A] =
    (l: A, r: A) => order.compare(f(l), f(r))

  def reverse[A](implicit order: Orderable[A]): Orderable[A] =
    (l: A, r: A) => order.compare(r, l)
}