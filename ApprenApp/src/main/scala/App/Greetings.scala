package App

import App.Greetings.name

import scala.io.StdIn

class Person(name:String, age:Int) {

  def speak() : String = {
    if(name =="Joshua") {
      "You don't get a hello!!!"
    } else {
      "hello " + name
    }
  }

  object Prompt {

    def ask(message: String) : String = StdIn.readLine(message)

  }
}

object Greetings extends App {

 /* def greet(name: String): Unit = {
    if (name == "Joshua") {
      println("You don't get a hello.")
    } else {
      println("Hello " + name)

    }
  }*/

    val name : String = Prompt.ask("What is your name? ")

    val p = new Person(name)

    println(p.speak())


  }

