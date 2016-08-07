name := "anchor-models"

organization := "com.anchor"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.url("Typesafe Ivy releases", url("https://repo.typesafe.com/typesafe/ivy-releases"))(Resolver.ivyStylePatterns)

libraryDependencies ++= Seq(
  "com.typesafe.play"           %% "play-json"             % "2.4.8"
)