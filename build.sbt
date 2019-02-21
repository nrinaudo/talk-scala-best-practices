enablePlugins(TutPlugin, GhpagesPlugin)

organization := "com.nrinaudo"
scalaVersion := "2.12.8"

val tutDirName = settingKey[String]("tut output directory")
tutDirName := "./"

addMappingsToSiteDir(tut, tutDirName)
includeFilter in SitePlugin.autoImport.makeSite :=
    "*.yml" | "*.md" | "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.eot" | "*.svg" | "*.ttf" |
    "*.woff" | "*.woff2" | "*.otf"

git.remoteRepo := "git@github.com:nrinaudo/talk-scala-best-practices.git"

libraryDependencies ++= Seq(
  "com.chuusai"                %% "shapeless"     % "2.3.3",
  "com.github.julien-truffaut" %% "monocle-core"  % "1.5.0",
  "com.github.julien-truffaut" %% "monocle-macro" % "1.5.0"
)
