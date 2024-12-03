```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    if (x == null) throw new NullPointerException("x cannot be null")
    value match {
      case _: Int => x + value.asInstanceOf[Int] 
      case _: String => x + value.asInstanceOf[String]
      case _ => throw new IllegalArgumentException("Unsupported type")
    }
  }
}

 object Main extends App{
  val myInt = new MyClass(5)
  val myString = new MyClass("hello")

  println(myInt.myMethod(3)) //Output 8
  println(myString.myMethod(" world")) //Output hello world
  //val myDouble = new MyClass(3.14) //This line will throw an IllegalArgumentException
  //println(myDouble.myMethod(2.71)) 
}
```