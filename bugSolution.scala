```scala
sealed trait MyType
case class IntType(value: Int) extends MyType
case class StringType(value: String) extends MyType

class MyClass[T <: MyType](val value: T) {
  def myMethod(x: T): MyType = (value, x) match {
    case (IntType(a), IntType(b)) => IntType(a + b)
    case (StringType(a), StringType(b)) => StringType(a + b)
    case _ => throw new IllegalArgumentException("Unsupported type combination")
  }
}

object Main extends App {
  val myInt = new MyClass(IntType(5))
  val myString = new MyClass(StringType("hello"))

  println(myInt.myMethod(IntType(3))) // Output: IntType(8)
  println(myString.myMethod(StringType(" world"))) // Output: StringType(hello world)
}
```