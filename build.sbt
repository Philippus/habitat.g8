name := "habitat.g8"
organization := "nl.gn0s1s"
startYear := Some(2018)
homepage := Some(url("https://github.com/philippus/habitat.g8"))
licenses += License.CC0

developers := List(
  Developer(
    id = "philippus",
    name = "Philippus Baalman",
    email = "",
    url = url("https://github.com/philippus")
  )
)

libraryDependencies ++= Seq(
  "org.scalameta" %% "munit"            % "1.1.1" % Test,
  "org.scalameta" %% "munit-scalacheck" % "1.1.0" % Test
)
