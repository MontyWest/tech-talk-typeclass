package mw.domain

import cats.Order
import cats.implicits._

final case class Person(age: Int, name: String)

object Person {
  implicit val personOrderable: Order[Person] = Order.by { person =>
    (person.age, person.name)
  }
}