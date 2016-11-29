name := "flakka-docs-java-lambda"

version := "2.3-custom"

scalaVersion := "2.10.4"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-a")

libraryDependencies ++= Seq(
  "com.data-artisans" %%      "flakka-actor" % "2.3-custom",
  "com.data-artisans" %%    "flakka-testkit" % "2.3-custom" % "test",
              "junit"  %           "junit" % "4.11"         % "test",
       "com.novocode"  % "junit-interface" % "0.10"         % "test")
