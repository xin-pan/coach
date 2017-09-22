name := """play-java"""
organization := "cn.thoughtworks.daimler"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4"
)

flywayDriver := "org.postgresql.Driver"
flywayUrl := "jdbc:postgresql://127.0.0.1:5432/tmp"
flywayUser := "postgres"
flywayPassword := "111111"
flywayLocations := Seq("classpath:db/migration/")