import kotlin.math.pow

fun main() {
    println("we won't write 'Hello!! World'...")
    println("we are going to develop this world...")
    println("we are the programmer of new era...")
    println("never compare us with anybody...")

    var myVar = 5
    println("value of myVar is $myVar")
    myVar = 10
    println("value of myVar now is $myVar")

    val sum = myVar + 10
    println("value of sum is $sum")

    val yourName = "Criminal..."
    println("Hello! Mr. $yourName")

    var trueOrFalse = true
    println("value of trueOrFalse variable is $trueOrFalse")
    trueOrFalse = false
    println("value of trueOrFalse vavriable is $trueOrFalse")

    println("sum of two integers inside of println statement ${20 + 21}")

    println("2 & 3: ${2 xor 3}")

    val x = 20
    val y = 3F
    println("value of x / y : ${(x / y)}")

    println("volume of sphere is ${0.75 * kotlin.math.PI * 1.0.pow(3.0)}")

    val name = "no_one"
    println("value of name variable is: $name")
    println("name in reversed order: ${name.toUpperCase().reversed()}")

    val aa = 5
    val bb = 5
    val cc = aa == bb && aa != bb
    println("value of cc where cc = aa == bb is: $cc")

    val palindrome = "racecare"
    val isPalindrome = palindrome == palindrome.reversed()
    if (isPalindrome) println("$palindrome is palindrome")
    else println("$palindrome is not palindrome")

    when (palindrome) {
        palindrome.reversed() -> println("$palindrome is palindrome")
        else -> println("$palindrome is not palindrome")
    }

    /*
    print("Enter some text: ")
    val enterSomething = readLine()
    println("Entered Text is: ${enterSomething?.toUpperCase()}")

    print("Enter your age: ")
    var age = readLine()?.toInt()

    if (age != null)
    {
        when {
            age >= 85 -> println("You are very old")
            age >= 65 -> println("You are old")
            age >= 18 -> println("You are an adult")
            else -> println("You are not an adult")
        }
    }
    else
        println("Enter a valid age...")

     */
    //ARRAY
    val myArray = arrayOf("I", "am", "a", "programmer")
    println("${myArray[0]} ${myArray[1]} ${myArray[2]} ${myArray[3]}")

    val myArraySize = myArray.size
    var i = 0
    while (i < myArraySize) {
        print("${myArray[i]} ")
        i++
    }

    /*//calculate power
    println()
    print("Enter 1st number: ")
    val firstNum = readLine()?.toDouble()
    print("Enter 2nd number: ")
    val secondNum = readLine()?.toDouble()
    println("$firstNum raise to the power $secondNum is: ${secondNum?.let { firstNum?.pow(it) }}")*/

    //for loop
    val myArray2 = arrayOf(1, 2, 3)
    for (j in myArray2)
        println("value of j is: $j")

    for (k in 100..102)
        println("value of k is: $k")

    for (l in 100 downTo 95 step 2)
        println("value of l is: $l")

    for (m in 'a'..'c')
        println("value of m is: $m")

    /*//find maximum
    val maxArray = arrayOf(20, 10, 3, 34, 45,2,12)
    var max = maxArray[0]
    var sumOfArray = 0
    for (item in maxArray) {
        sumOfArray += item
        if (item > max) {
            max = item
        }
    }
    println("max is: $max\t\tand sum of array is: $sumOfArray")

    //calculate average of 5 numbers
    println("Enter 5 numbers:")
    var avg = 0
    for (zz in 0..4) {
        val temp = readLine()?.toInt()
        if (temp != null)
            avg += temp
    }
    println("average of 5 numbers is: ${avg/5.0}")*/

    //list
    //mutable and immutable
    val myList = mutableListOf(1, 2, 5, 6)
    myList.add(5)
    println("values stored in myList: $myList")
    myList.remove(5)
    println("Values stored in myList: $myList")
    myList.removeAt(0)
    println("values stored in MyList: $myList")

    /*//take input of 5 integers
    val myList1 = mutableListOf<Int>()
    println("Enter 5 space separated integer: ")
    for (ll in 1..5) {
        val ij = readLine()?.toInt()
        if (ij != null)
            myList1.add(ij)
    }
    println("values stored are: $myList1")*/

    /*//take 5 integer input and print it in reverse order
    println("Enter five integers:")
    val revList = mutableListOf<Int>()
    for (ik in 1..5) {
        val inputNum = readLine()?.toInt()
        if (inputNum != null)
            revList.add(inputNum)
    }
    println("values in reverse order: ${revList.asReversed()}")*/

    /*//fibonacci series
    val fibonacci = mutableListOf(0, 1)
    print("Enter a number > 1: ")
    val fibRange = readLine()?.toInt()
    if (fibRange != null) {
        if (fibRange >= 3) {
            for (fib in 3..fibRange) {
                fibonacci.add(fibonacci[fib - 2] + fibonacci[fib - 3])
            }
        }
    }
    println("required fibonacci series is: $fibonacci")*/

    //when
    print("From where you are:")
    when (readLine()) {
        "india", "INDIA", "India" -> println("Namaste")
        "usa", "USA", "Usa" -> println("Hello")
        else -> println("greet yourself in your own way")
    }
}