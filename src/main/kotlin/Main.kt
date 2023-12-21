fun main(args: Array<String>) {

    val a = 20
    val b = 5
    val myArray = arrayOf(2, 5, 7)
    val findVowel = "Hey! I am finding vowels in this sentence"

    // 1) Finding Max
    println("Question:1 (Finding Max)")
    findingMax(a, b)

    // 2) Finding MIN
    println("Question:2 (Finding Min)")
    findingMin(50, 100)

    // 3) Finding length of a string
    println("Question:3 (Finding length of the string)")
    findingLength("My name is Hamza")

    // 4) check even odd and loop
    println("Question:4 (Check even or odd number and then loop ( even = forward / odd = backward ))")
    checkEvenOdd(myArray)

    // 5) Finding Vowel in string
    println("Question 5: (Finding vowel in a string)")
    findingVowel(findVowel)
}

//Functions
fun findingMax(x: Int, y: Int) {
    if (x > y) {
        println("$x is greater $y")
    } else if (y > x) {
        println("$y is greater $x")
    } else {
        println("$x and $y are equal")
    }
}

fun findingMin(x: Int, y: Int) {
    if (x < y) {
        println("$x is smaller than $y")
    } else if (y < x) {
        println("$y is smaller than $x")
    } else {
        println("$x and $y are equal")
    }
}

fun findingLength(string: String) {
    var j = 0;
    for (i in string) {
        j++;
    }
    println(j)
}

fun checkEvenOdd(newArray: Array<Int>) {
    for (i in newArray) {
        if (i % 2 == 0) {
            println("Forward Table of $i")
            for (j in 1..10) {
                println(j * i)
            }
        } else {
            println("Backward Table of $i")
            for (k in 10 downTo 1) {
                println(k * i)
            }
        }
    }
}

fun findingVowel(vowel: String) {
    var count=0;
    for (i in vowel) {
       if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
           count++;
       }
    }
    println("There are $count vowels in this sentence")
}








