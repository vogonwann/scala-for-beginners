package lectures.part2oop

import lectures.part2oop.OOBasics.person

object Objects extends App {
  // SCALA DOES NOT HAVE CLASS-LEVEL FUNTIONALITY (static)
  // Instead it has objects
  object Person {
    // "static"/"class" - level functionality
     val N_EYES = 2
     def canFly: Boolean = false
     // factory method
     def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance level functionality
  }

  // class Person and object Person are called companions

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETONE INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john) // false

  var bobbie = Person(mary, john)

  val person1 = Person
  val person2 = Person
  println(person1 == person2) // true

  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit

}
