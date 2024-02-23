package lectures.part1basics

object Functions extends App {
  
    def aFunction(a: String, b: Int): String =
        a + " " + b

    println(aFunction("Hello", 6))

    def aParameterlessFunction(): Int = 42
    println(aParameterlessFunction())

    def aRepatedFunction(aString: String, n: Int): String = {
        if (n == 1) aString
        else aString + aRepatedFunction(aString, n - 1)
    }

    println(aRepatedFunction("hello", 3))

    // WHEN YOU NEED LOOPS, USE RECURSION

    def aFunctionWithSideEffects(aString: String): Unit = println(aString)

    def aBigFunction(n: Int): Int = {
        def aSmallerFunction(a: Int, b: Int): Int = a + b

        aSmallerFunction(n, n-1)
    }

    def greet(name: String, age: Int): String =
        "Hi, my name is " + name + " and I'm " + age + " years old."

    println(greet("Ivan", 42))

    def aFactorial(n: Int): Int = 
        if (n <= 0) 1
        else n * aFactorial(n -1)
    

    def fibonacci(n: Int): Int = 
        if (n <= 2) 1
        else fibonacci(n - 1) + fibonacci(n - 2)
    

    def isPrime(n: Int): Boolean = {
        def isPrimeUntil(t: Int): Boolean =
            if (t <= 1) true
            else n % t != 0 && isPrimeUntil(t - 1)

        isPrimeUntil(n / 2)
    }

    println(aFactorial(5))
    println(fibonacci(8))
    println(isPrime(37))
    println(isPrime(2003))
    println(isPrime(2003 * 17))
}
