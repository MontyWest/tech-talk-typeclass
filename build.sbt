name := "tech_talk-typeclass"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.lihaoyi" % "ammonite" % "1.6.3" cross CrossVersion.full,
  "org.typelevel" %% "cats-core" % "1.4.0"
)

mainClass := Some("com.ovoenergy.service.Ammonite")

showSuccess := false

logLevel in run := Level.Warn
