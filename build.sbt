name := "habitat.g8"
organization := "nl.gn0s1s"
startYear := Some(2018)
homepage := Some(url("https://github.com/philippus/habitat.g8"))
licenses += ("CC0 1.0 Universal", url("https://creativecommons.org/publicdomain/zero/1.0/"))

developers := List(
  Developer(
    id = "philippus",
    name = "Philippus Baalman",
    email = "",
    url = url("https://github.com/philippus")
  )
)

resolvers += Resolver.typesafeIvyRepo("releases")
