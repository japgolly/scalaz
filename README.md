# Scalaz on Scala.JS

This has been compiled for Scala.JS and published to Maven central under `com.github.japgolly.fork.scalaz`.

#### Usage

build.sbt
```
libraryDependencies += "com.github.japgolly.fork.scalaz" %%% "scalaz-core" % "7.1.1-2"
```

### Changes

* Compiled for Scala.js 0.6.0+
* Removed support for
  * `java.math.BigInteger`
  * `java.util.concurrent.Callable`
  * `scala.math.BigDecimal`
  * `scala.math.BigInt`
  * `scala.xml.NodeSeq`
