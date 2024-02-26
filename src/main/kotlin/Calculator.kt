

/* creating a program that will accept two integer -
numbers and one operation from the user and give an answer */

fun main(){

println("Enter <<calc>> if you want to calculate numbers")
val userInput = readlnOrNull()
    if (userInput == "calc")
    {print(calculator())}
    else{println("If you want to calculate numbers, run the program again and write <<calc>>")}
}
fun calculator()
{    print ("Please select an operation by entering the appropriate number:\n 1 for Addition\n 2 for Subtraction\n 3 for Multiplication\n 4 for Division\n Please enter number: ")
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

