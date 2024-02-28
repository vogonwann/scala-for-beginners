package lectures.part2oop

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahahhahaha")
  }

  // ^ compiler converts this to
  // <==
  class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit = println("hahahahahhaha")
  }

  val funnyAnimal2: Animal = new AnonymousClasses$$anon$1
  // ==>
    
  println(funnyAnimal.getClass)
  println(funnyAnimal2.getClass)
}
