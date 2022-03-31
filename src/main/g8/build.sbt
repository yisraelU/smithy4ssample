import smithy4s.codegen.Smithy4sCodegenPlugin

lazy val root = (project in file(".")).
   settings(
     inThisBuild(List(
       name := """$name$""",
       organization := "$organization$",
       scalaVersion := "$scala_version$"
     )),
     libraryDependencies ++= Seq(
       "com.disneystreaming.smithy4s" %% "smithy4s-core" % smithy4sVersion.value,
       "com.disneystreaming.smithy4s" %% "smithy4s-http4s" % smithy4sVersion.value,
       "com.disneystreaming.smithy4s" %% "smithy4s-http4s-swagger" % smithy4sVersion.value,
       "org.http4s" %% "http4s-ember-server" % "0.23.11"
     ).enablePlugins(Smithy4sCodegenPlugin)


