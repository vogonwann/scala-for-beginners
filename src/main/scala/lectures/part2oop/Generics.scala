package lectures.part2oop

import lectures.part2oop.Inheritance.unknownAnimal
import lectures.part2oop.AbstractDataTypes.Animal

object Generics extends App {
  class MyList[A] {

  }

  class MyMap[Key, Value] {

  }

  val listOfIntegers = MyList[Int]
  val listOfStrings = MyList[String]

  object MyList {
    // companion object
    def empty[A]: MyList[A] = ???
  }

  var emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION

  // 2. no - INVARIANCE
  class InvariantList[A]
  val invariatnAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val contravariantList:Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal] (animal: A) // this generic class can only be used with the subtypes of Animal
  val cage = new Cage(new Dog)
}
