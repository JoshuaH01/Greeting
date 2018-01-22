package App

import scala.io.StdIn

object Greetings extends App {

 def greet(name: String) : Unit = println(s"Hello $name!")

  val name = StdIn.readLine("What is your name? ")

greet("Joshua")

}
