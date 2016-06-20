name := """test-play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
val spring_version = "4.1.6.RELEASE"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.springframework" % "spring-test" % spring_version % "test",
  "org.mockito" % "mockito-core" % "1.10.19" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "com.jolbox" % "bonecp" % "0.8.0.RELEASE",
  "javax.inject" % "javax.inject" % "1",
  "com.opencsv" % "opencsv" % "3.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "org.springframework" % "spring-context" % spring_version,
  "org.springframework" % "spring-jdbc" % spring_version
)
