@file:JvmName("GreetingsKt")


//A program that responds to input "hello" and outputs "hello Julian"

fun main() {
   println("Enter text: ")
    val enterString = readln()
    if (enterString == "Hello" || enterString =="hello")
    {println(userInput()) }
    else
    {println ("Thx && goodbye")}
   }
fun userInput()
{
    println("Hello Julian")
}

