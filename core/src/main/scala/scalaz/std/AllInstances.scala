package scalaz.std

trait AllInstances
  extends AnyValInstances with FunctionInstances with ListInstances with MapInstances
  with OptionInstances with SetInstances with StringInstances with StreamInstances
  with TupleInstances with VectorInstances with FutureInstances
  with EitherInstances with PartialFunctionInstances with TypeConstraintInstances
  // with scalaz.std.math.BigDecimalInstances with scalaz.std.math.BigInts // japgolly
  with scalaz.std.math.OrderingInstances
  with scalaz.std.util.parsing.combinator.Parsers
  with scalaz.std.java.util.MapInstances
  // with scalaz.std.java.math.BigIntegerInstances // japgolly
  with scalaz.std.java.EnumInstances
  // with scalaz.std.java.util.concurrent.CallableInstances // japgolly
  // with NodeSeqInstances // japgolly

object AllInstances extends AllInstances
