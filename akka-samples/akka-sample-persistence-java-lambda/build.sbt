name := "flakka-sample-persistence-java-lambda"

version := "1.0"

scalaVersion := "2.10.4"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

libraryDependencies ++= Seq(
  "com.data-artisans" %% "flakka-persistence-experimental" % "2.3-custom"
)

