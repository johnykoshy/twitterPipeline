//import play.PlayScala
//import sbt.Keys._

name := """twitterPipeline"""
organization:= "de.geoheil"

version := "1.0-SNAPSHOT"

lazy val twitterPipeline = (project in file(".")).aggregate(frontend)

lazy val frontend = (project in file("modules/frontend")).enablePlugins(PlayScala)
//lazy val backend = project in file("modules/backend")

val runAll = inputKey[Unit]("Runs all subprojects")

runAll := {
  (run in Compile in `frontend`).evaluated
}

fork in run := true

// enables unlimited amount of resources to be used :-o just for runAll convenience
concurrentRestrictions in Global := Seq(
  Tags.customLimit( _ => true) 
)
