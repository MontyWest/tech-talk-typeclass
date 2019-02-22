package mw.domain

trait Orderable[A] {

  /***
    * this < other : negative
    * this = other : zero
    * this > other : positive
    */
  def compare(other: A): Int

  def <(other: A): Boolean = compare(other) < 0
}
