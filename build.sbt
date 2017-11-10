lazy val root = (project in file("."))
	.settings(
		name := "kwrapper-sbt",
		organization := "com.github.kneelawk",
		version := "0.0.1-SNAPSHOT",
		scalaVersion := "2.12.4",
		sbtPlugin := true
	)
		