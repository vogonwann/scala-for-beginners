package lectures.part2oop

object AbstractDataTypes extends App {

	// abstract
	abstract class Animal {
		val creatureType: String
		def eat(): Unit
	}

	class Dog extends Animal {
		override val creatureType: String = "Canine"
		override def eat(): Unit = println("crunch crunch")
	}

	// traits
	trait Carnivore {
		def eat(animal: Animal): Unit
	}

	class Crocodile extends Animal with Carnivore {
		val creatureType: String = "croc"
		def eat(): Unit = println("nom nom")
		def eat(animal: Animal): Unit = s"I'm a croc and I'm eating ${animal.creatureType}"
	}

	var dog = new Dog
	val croc = new Crocodile
	croc.eat(dog)

	// traits vs abstract classes
	// 1. = tratis do not have constructor paremeters
	// 2. = multiple traits may be inherited by the same class but only one class can be extended
	// 3. = traits = behavior, abstract class = "thing"
}
