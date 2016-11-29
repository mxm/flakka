import NativePackagerHelper._

name := "hello-kernel"

version := "0.1"

val akkaVersion = "2.3-custom"

libraryDependencies ++= Seq(
  "com.data-artisans" %% "flakka-kernel" % akkaVersion,
  "com.data-artisans" %% "flakka-actor" % akkaVersion,
  "com.data-artisans" %% "flakka-slf4j" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.0.7"
)

mainClass in Compile := Some("flakka.kernel.Main")

enablePlugins(JavaServerAppPackaging)

mappings in Universal ++= {
  // optional example illustrating how to copy additional directory
  directory("scripts") ++
  // copy configuration files to config directory
  contentOf("src/main/resources").toMap.mapValues("config/" + _)
}

// add 'config' directory first in the classpath of the start script,
// an alternative is to set the config file locations via CLI parameters
// when starting the application
scriptClasspath := Seq("../config/") ++ scriptClasspath.value
