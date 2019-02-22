package mw.domain

final case class Person(age: Int, name: String)

object Person {
  implicit val personOrderable: Orderable[Person] = new Orderable[Person] {
    /** *
      * l < r : negative
      * l = r : zero
      * l > r : positive
      */
    override def compare(l: Person, r: Person): Int = l.age - r.age
  }
}