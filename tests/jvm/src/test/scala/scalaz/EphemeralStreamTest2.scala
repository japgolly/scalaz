package scalaz

import std.AllInstances._

object EphemeralStreamTest2 extends SpecLite {
  "foldLeft large stream" in {
    val list = List.fill(10000000)(1)
    val xs = EphemeralStream(list : _*)
    Foldable[EphemeralStream].foldLeft(xs, 0)(_ + _) must_===(list.sum)
  }
}