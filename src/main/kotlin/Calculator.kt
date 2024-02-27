

/* creating a program that will accept two integer -
numbers and one operation from the user and give an answer */

fun main(){

println("""Press the corresponding number to select the program
    |1 for Calculator
    |2 for Array of numbers
    |3 for calculate the square of a number
    |4 for calculate the square of all numbers from 1 to "n"
""".trimMargin())

val userInput = readlnOrNull()
    if (userInput == "1")
       {print(calculator())}
    else if(userInput == "2")
       {println(array())}
    else if(userInput == "3")
       {println(calculateSquare())}
    else if(userInput == "4")
       {println(squareOfNumbersInLoop())}
    else{println("Яou chose the wrong number")}
}


fun squareOfNumbersInLoop(){

    println("Enter an integer number to calculate the squares from 0 to the entered value")

    val userInput1 = readLine()
    val n = userInput1?.toIntOrNull()

    if (n != null) {
        for(i in 1..n){
            println(i*i)
        }
    }
    else
        println("error")
    }

fun calculateSquare(){

    println("Write an integer number")
    val userInput2 = readLine()
    val a = userInput2?.toIntOrNull()

    if (a != null) {
        println("Square of $a equals to ${a * a}")
    } else {
        println("Invalid input. Please enter an integer.")
    }

}

fun array() {

    val numbers = arrayOf(1, 2, 3, 4)

    for (x in numbers) {
        println(x)
    }
}

fun calculator()
{    print ("""Please select an operation by entering the appropriate number:
    |1 for Addition
    |2 for Subtraction
    |3 for Multiplication
    |4 for Division
    |Please enter number: """.trimMargin())

    val operationNumber = readln().toInt()
    println ("Enter the first Number:")
    val firstnumber = readln().toInt()
    println ("Enter the second Number:")
    val secondnumber = readln().toInt()

    if (operationNumber == 1)
    {println("Result: $firstnumber + $secondnumber = " + (firstnumber + secondnumber))}
    else if (operationNumber == 2)
    {println("Result: $firstnumber - $secondnumber = " + (firstnumber - secondnumber))}
    else if (operationNumber == 3)
    {println("Result: $firstnumber * $secondnumber = " + (firstnumber * secondnumber))}
    else if (operationNumber == 4)
    {println("Result: $firstnumber / $secondnumber = " + (firstnumber / secondnumber))}
    else{println("you chose the wrong operator number")}
}

