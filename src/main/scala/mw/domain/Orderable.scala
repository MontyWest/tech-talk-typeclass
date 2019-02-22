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