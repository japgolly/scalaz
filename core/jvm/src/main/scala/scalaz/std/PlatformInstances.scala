package scalaz
package std

/**
 * Instances available on the JVM only.
 */
trait PlatformInstances
  extends scalaz.std.java.TimeInstances

trait FutureInstancesP extends FutureInstances1 {
  import scala.concurrent.{Await, ExecutionContext, Future}
  import scala.concurrent.duration.Duration

  /**
   * Requires explicit usage as the use of `Await.result`. Can throw an exception, which is inherently bad.
   *
   * JVM-only because `Await` is not available in JS.
   */
  def futureComonad(duration: Duration)(implicit executionContext: ExecutionContext): Comonad[Future] = new FutureInstance with Comonad[Future] {
    def copoint[A](f: Future[A]): A = Await.result(f, duration)
  }
}
