organization := "com.nrinaudo"
scalaVersion := "2.12.1"
tutSettings

val tutDirName = settingKey[String]("tut output directory")
tutDirName := "./"

enablePlugins(GhpagesPlugin)

addMappingsToSiteDir(tut, tutDirName)
includeFilter in SitePlugin.autoImport.makeSite :=
    "*.yml" | "*.md" | "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.eot" | "*.svg" | "*.ttf" |
    "*.woff" | "*.woff2" | "*.otf"

git.remoteRepo := "git@github.com:nrinaudo/talk-scala-best-practices.git"
