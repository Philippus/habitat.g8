name := "$name$"
organization := "$organization$"
version := "$version$"
startYear := Some(2018)
homepage := Some(url("https://github.com/philippus/$name$"))
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

crossScalaVersions := List("2.11.12", "2.12.6")
scalaVersion := crossScalaVersions.value.last

bintrayOrganization := Some("gn0s1s")
bintrayRepository := "releases"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.14.0" % Test
)

pomExtra :=
  <scm>
    <url>git@github.com:Philippus/$name$.git</url>
    <connection>scm:git@github.com:Philippus/$name$.git</connection>
  </scm>
  <developers>
    <developer>
      <id>philippus</id>
      <name>Philippus Baalman</name>
      <url>https://github.com/philippus</url>
    </developer>
  </developers>
