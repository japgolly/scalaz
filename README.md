# Scalaz on Scala.JS

This has been compiled for Scala.JS and published to bintray under `japgolly.scalaz`.

#### Usage

project/plugins.sbt
```
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.1")
```

build.sbt
```
resolvers += bintray.Opts.resolver.repo("japgolly", "forks")

libraryDependencies += "japgolly.scalaz" %%% "scalaz-core" % "7.1.0-RC1"
```

#### Manual Download
https://bintray.com/japgolly/forks/japgolly.scalaz
