package App

import App.Greetings.name

import scala.io.StdIn

class Person(name:String, age:Int) {

  def speak() : String = {
    if(name =="Joshua") {
      "You don't get a hello!!!"
    } else {
      "hello " + name + ",you are " + age + " years old"
    }
  }
 }

object Greetings extends App {


  object Prompt {

    def ask(message: String) : String = StdIn.readLine(message)

  }


    val name : String = Prompt.ask("What is your name? ")
  val age = Prompt.ask("How old are you?")

    val p = new Person(name,age.toInt)
  println(p.speak())


  }

