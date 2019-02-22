package mw

object Ammonite {

  def main(args: Array[String]): Unit = {
    ammonite.Main(
      predefCode =
        """
          |import mw.ops;
          |import mw.domain._;
          |
          |val personLs = List(Person(23, "alice"), Person(35, "bob"), Person(21, "charlie"));
          |val intLs = List(-5, 8, 10, 2, 5);
        """.stripMargin
    ).run()
  }
}
