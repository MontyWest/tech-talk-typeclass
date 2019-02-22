name := "tech-talks"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += {
  val version = scalaBinaryVersion.value match {
    case "2.10" => "1.0.3"
    case _ ⇒ "1.6.3"
  }
  "com.lihaoyi" % "ammonite" % version % "test" cross CrossVersion.full
}
libraryDependencies +=
  ("org.typelevel" %% "cats-core" % "1.4.0")

sourceGenerators in Test += Def.task {
  val file = (sourceManaged in Test).value / "amm.scala"
  IO.write(file, """object amm extends App { ammonite.Main.main(args) }""")
  Seq(file)
}.taskValue