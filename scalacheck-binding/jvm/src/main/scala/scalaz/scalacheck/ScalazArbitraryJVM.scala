package scalaz
package scalacheck

import org.scalacheck.Arbitrary
import Scalaz._
import Arbitrary._
import ScalaCheckBinding._

/**
 * Instances of {@link scalacheck.Arbitrary} for JVM-only parts of Scalaz.
 */
abstract class ScalazArbitraryPlatform {

  import java.util.concurrent.Callable
  implicit def CallableArbitrary[A: Arbitrary]: Arbitrary[Callable[A]] =
    Functor[Arbitrary].map(implicitly[Arbitrary[A]])((x: A) => Applicative[Callable].point(x))

  import scalaz.concurrent.Future
  implicit def FutureArbitrary[A: Arbitrary]: Arbitrary[Future[A]] =
    Arbitrary(arbitrary[A] map ((x: A) => Future.now(x)))

  import scalaz.concurrent.Task
  implicit def TaskArbitrary[A: Arbitrary]: Arbitrary[Task[A]] =
    Arbitrary(arbitrary[A] map ((x: A) => Task.now(x)))
}
