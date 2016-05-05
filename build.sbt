name := """specs2-issue-478"""

version := "1.0"

scalaVersion := "2.11.7"

// *** The version below has no problems running "sbt test" ***
//libraryDependencies += "org.specs2" %% "specs2-core" % "3.7-20160219163315-d9c5826" % "test"

// *** The version below encounters errors when running "sbt test" ***
libraryDependencies += "org.specs2" %% "specs2-core" % "latest.release" % "test"


// *** Akka latest versions ***
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "latest.release" % "test"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "latest.release" % "test"


// *** Akka older versions: from Nov, 2015 - (to demonstrate that the issue occurs across Akka versions whenever Specs2 3.8 is used) ***
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.1" % "test"
//libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.4.1" % "test"
