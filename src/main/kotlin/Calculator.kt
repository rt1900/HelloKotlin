
fun main(){

println("""Enter the corresponding number to select the program
    |1.3 for Calculator 
    |2.2 for Array of numbers
    |2.3 for calculate the square of a number
    |2.4 for to calculate the square of all numbers from 1 to the number you entered
    |2.5 to call the list of names\n
    |2.6 to select the program for separating sentences into words
    |2.7 to get a get data of personA
    |2.7.1 to get a get data of personB
""".trimMargin())

val userInput = readln()
    if (userInput == "1.3")
       {print(calculator())}
    else if(userInput == "2.2")
       {println(array())}
    else if(userInput == "2.3")
       {println(squareCalculationProgram())}
    else if(userInput == "2.4")
       {println(squareOfNumbersInLoop())}
    else if(userInput=="2.5")
       {println(mutableListOf())}
    else if((userInput=="2.6"))
       {println(splitString())}
    else if((userInput=="2.7"))
       {println(class1())}
    else if((userInput=="2.7.1"))
    {println(dataclass())}
    else{println("You chose the wrong number") }
}

//-------------------------------------------------------------------------------------------------------
/* Task 2.2. GIVEN an array numbers with values [1, 2, 3, 4],
WHEN you iterate through the array and print each element */
fun array() {

    val numbers = arrayOf(1, 2, 3, 4)

    for (x in numbers) {
        println(x)
    }
}

//-------------------------------------------------------------------------------------------------------
/*Task 2.3. function to calculate the square */
fun squareCalculation(a : Int) {

    println("Square of number $a is equal to ${a*a}")
}
//-------------------------------------------------------------------------------------------------------
// Task 2.3. A program for calculating the square of a number*
fun squareCalculationProgram () {

    println("Write an integer number")
    val a = readLine()?.toIntOrNull()

    if (a != null) {
        println(squareCalculation(a))
    } else {
        println("Invalid input.")
        squareCalculationProgram()
    }
}

//-------------------------------------------------------------------------------------------------------
/*Task 2.4. GIVEN a loop that iterates from 1 to n,
WHEN you get a user input,
THEN print the square of each number in the loop*/
fun squareOfNumbersInLoop(){

    println("Enter an integer number to calculate the squares from 0 to the entered value")

    val userInput1 = readLine()
    val n = userInput1?.toIntOrNull()

    if (n != null) {
        for(i in 1..n){
            println(squareCalculation(i))
        }
    }
    else
        {println("You entered an incorrect value")}
        squareOfNumbersInLoop()
    }

//-------------------------------------------------------------------------------------------------------
/* Task 2.5 Displaying the list of names,
adding a name to the list,
removing a name from the list,
displaying the length of the list */
fun mutableListOf(){

    var names = mutableListOf("Alice", "Bob", "Charlie")
    println(names)
    names.add("David")
    println(names)
    names.remove("Alice")
    println(names)
    println(names.size)
}
//-------------------------------------------------------------------------------------------------------
/* task 2.6 GIVEN a String sentence with the value "Hello World",
WHEN you split the string into words,
THEN the result SHOULD be ["Hello", "World"]*/
fun splitString() {
    val txt = "Hello World"
    val wordList = txt.split(" ")
    println(wordList)
}



/*Create a Person class with name and age
and give them the values John and 26*/
fun class1() {

    var personA = PersonA ("John", 26)
    println("Name " + personA.name + " and age " + personA.age)
}

/*Create a Person data class with name and age
and give them the values John and 26*/
fun dataclass() {
    var personb = PersonB ("John", 28)
    println(personb)
}


//-------------------------------------------------------------------------------------------------------
/* Task 1.3. Function for calculating two integers.
*  The user should be able to perform addition, subtraction,
* multiplication, and division operations using the calculator function*/
fun calculator()
{    print ("""Please select an operation by entering the appropriate number:
    |1 for Addition
    |2 for Subtraction
    |3 for Multiplication
    |4 for Division
    |Please enter number: """.trimMargin())

    val operationNumber = readln()?.toIntOrNull()
    if(operationNumber!=null){
       println ("Enter the first Number:")}
    else
       {println("You have selected the wrong operation number")
       calculator()}

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

