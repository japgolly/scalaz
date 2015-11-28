package scalaz
package std.java

// TODO Move this back into shared once Scala.JS 0.6.6 is released.

trait EnumInstances {
  implicit def enumInstance[E <: java.lang.Enum[E]] = Equal.equal[E](_ eq _)
}

object enum extends EnumInstances
