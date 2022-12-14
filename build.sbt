name := """Checkers_WA"""
organization := "htwg"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test


Assets / LessKeys.less / includeFilter := "*.less"
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "htwg.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "htwg.binders._"
