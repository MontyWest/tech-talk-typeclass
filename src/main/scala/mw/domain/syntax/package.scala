package mw.domain

package object syntax {

  implicit class OrderableSyntax[A](a: A)(implicit order: Orderable[A]) {
    def <(other: A): Boolean = order.<(a, other)
  }

}
