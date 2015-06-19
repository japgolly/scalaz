# Scalaz on Scala.JS

This has been compiled for Scala.JS and published to Maven central under `com.github.japgolly.fork.scalaz`.

#### Usage
build.sbt
```scala
libraryDependencies += "com.github.japgolly.fork.scalaz" %%% "scalaz-core" % "7.1.3"
```

### Changes
* Compiled for Scala.js 0.6.3+
* Removed support for
  * `java.util.concurrent.Callable`
  * `scala.xml.NodeSeq`
