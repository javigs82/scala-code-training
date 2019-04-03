ThisBuild / version := "1.0.0"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "me.javigs82"


val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

lazy val root = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "scala-code-training",
    libraryDependencies += scalaTest % Test,
  )