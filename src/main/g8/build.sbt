name := "$name$"
organization := "$organization$"
startYear := Some(2022)
homepage := Some(url("https://github.com/philippus/$name$"))
licenses += ("MPL-2.0", url("https://www.mozilla.org/MPL/2.0/"))

developers := List(
  Developer(
    id = "philippus",
    name = "Philippus Baalman",
    email = "",
    url = url("https://github.com/philippus")
  )
)

crossScalaVersions := List("$scalaVersion$")
scalaVersion := crossScalaVersions.value.last

ThisBuild / versionScheme := Some("semver-spec")
ThisBuild / versionPolicyIntention := Compatibility.BinaryCompatible

Compile / packageBin / packageOptions += Package.ManifestAttributes(
  "Automatic-Module-Name" -> "$organization$.$mainPackage$"
)

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "org.scalameta" %% "munit"            % "1.1.0" % Test,
  "org.scalameta" %% "munit-scalacheck" % "1.1.0" % Test
)

ThisBuild / turbo := true
