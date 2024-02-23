package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")
}
 // constructor
class Person(name: String, val age: Int) {
    // body
    val x = 2 // val and var are fields

    println(1 + 3)

    def greet(name: String): Unit = println(s"${this.name} says: Hi $name")

    // overloading
    def greet(): Unit = println(s"Hi, I am $name")

    // multiple contructors * constructor overloading
    def this(name: String) = this(name, 0)
    def this() = this("John Doe")
}

class Writer(val firstName: String, val surname: String, val age: Int) {
    def fullName: String =
        s"$firstName $surname"
}

class Novel(name: String, yearOfRelease: Int, val author: Writer) {
    def authorAge: Int =
        yearOfRelease - author.age
    
    def isWrittenBy(author: Writer): Boolean =
        // 
        author == this.author

    def copy(yearOfRelease: Int): Novel =
        new Novel(this.name, yearOfRelease, author)
}

class Counter(val count: Int) {
    def currentCount(): Int = count

    def increment =
        new Counter(count + 1)

    def decrement =
        new Counter(count - 1)

    def increment(n: Int): Counter = {
        if (n <= 0) this
        else increment.increment(n - 1)
    }

    def decrement(n: Int): Counter = {
        if (n <= 0) this
        else decrement.decrement(n - 1)
    }
}

// class parameters are not fields
