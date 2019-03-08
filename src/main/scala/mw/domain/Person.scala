package mw.domain

import cats.Order
import cats.instances.int._

final case class Person(age: Int, name: String)

object Person {
  implicit val personOrderable: Order[Person] = Order.by(_.age)
}