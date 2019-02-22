package mw

import mw.domain.Orderable
import mw.domain.syntax._


package object ops {

  def sortInts(ls: List[Int]): List[Int] = ls match {
    case Nil => Nil
    case _ :: Nil => ls
    case x :: xs =>
      sortInts(xs.filter(a => a < x)) ++ List(x) ++ sortInts(xs.filterNot(a => a < x))
  }

  def sort[A](ls: List[A])(implicit order: Orderable[A]): List[A] = ls match {
    case Nil => Nil
    case _ :: Nil => ls
    case x :: xs =>
      sort(xs.filter(_ < x)) ++ List(x) ++ sort(xs.filterNot(_ < x))
  }
}
