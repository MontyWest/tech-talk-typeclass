package mw.domain

final case class Person(age: Int, name: String)

object Person {
  implicit val personOrderable: Orderable[Person] = Orderable.by(_.age)
}