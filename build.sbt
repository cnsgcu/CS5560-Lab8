name := "PlayJournal"

version := "1.0"

lazy val `playjournal` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.2"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws, "edu.washington.cs.knowitall.openie" % "openie_2.10" % "4.1.3" )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  