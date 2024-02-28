package lectures.exercises

import scala.compiletime.ops.boolean

abstract class MyList[+A] {
  /* 
    head = first element of the list
    tail = remainder of the lsit
    isEmpty = is this list empty
    add(int) => new list with this element added
    toString => a string representation of the list
   */

   def head: A
   def tail: MyList[A]
   def isEmpty: Boolean
   def add[B >: A](element: B): MyList[B]
   def printElements: String
   // polymorphic call
   override def toString(): String = "[" + printElements + "]"
}

object Empty extends MyList[Nothing] {
    def head: Nothing = throw new NoSuchElementException
    def tail: MyList[Nothing] = throw new NoSuchElementException
    def isEmpty: Boolean = return true
    def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)
    def printElements: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
    def head: A = h
    def tail: MyList[A] = t
    def isEmpty: Boolean = false
    def add[B >: A](element: B): MyList[B] = new Cons(element, this)
    def printElements: String = 
        if (tail.isEmpty) "" + h
        else s"$h ${t.printElements}"
    }

object ListTest extends App {
    var list = new Cons(1, new Cons(2, new Cons(3, Empty)))
    var listOfStrings = new Cons("Hello", new Cons("World", new Cons("!", Empty)))

    println(list.toString)
    println(listOfStrings.toString)
}