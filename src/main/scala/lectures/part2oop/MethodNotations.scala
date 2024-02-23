package lectures.part2oop

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String, age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = 
        s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"$name, what the heck!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(times: Int) = s"$name watched $favoriteMovie $times times"
    def learns(topic: String) = s"$name learns $topic"
    def learnsScala: String = learns("Scala")
  }

  var mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation = operator notation works only with methods with one parameter

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)

  println(1 + 2)
  println(1.+(2))
  val mary1 = mary + "the rockstar"
  println(mary1.name)
  println(mary learns "scala")
  println(mary.learnsScala)
  println(mary(3))
  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ? + - ...

  // prefix notation

  val x = -1
  // is same as
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)
  println(+mary);

  // postfix notation (available only to methods without params)
  println(mary.isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent
}
