package lectures.part2oop

object Inheritance extends App {
  
    class Animal {
        def eat = println("nom nom nom")
    }

    class Cat extends Animal {
        def crunch = {
            eat
            println("crunch crunch")
        }
    }

    val cat = new Cat
    cat.crunch

    // constructors
    class Person(name: String, age: Int)
    class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

    // overriding
    class Dog(val creatureType: String) extends Animal {
        override def eat: Unit = println("crunch crunch")
    }

    val dog = new Dog("K9")
    dog.eat

    // type substitution (broad: polymorphism)
    val unknownAnimal: Animal = new Dog("K9")
    unknownAnimal.eat

    // Prevent override
    //   1. final on member
    //   2. final on the entire class
    //   3. seal the class = extend classes in THIS FILE, prevent extension in other files
}
