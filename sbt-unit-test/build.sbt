
name := "sbt-unit-test"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test
//  "junit" % "junit" % "4.12" % Test
)