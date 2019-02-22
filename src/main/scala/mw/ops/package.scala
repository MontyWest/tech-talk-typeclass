package mw

package object ops {

  def sortInts(ls: List[Int]): List[Int] = ls match {
    case Nil => Nil
    case _ :: Nil => ls
    case x :: xs =>
      sortInts(xs.filter(a => a < x)) ++ List(x) ++ sortInts(xs.filterNot(a => a < x))
  }

  def sort[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case _ :: Nil => ls
    case x :: xs =>
      sort(xs.filter(a => a < x)) ++ List(x) ++ sort(xs.filterNot(a => a < x))
  }
}
