package InheratenceTree

import InheratenceTree.Inheratence.Animal

import scala.Boolean
import scala.io.StdIn

object Inheratence extends App {

  class Animal(name: String, arms: Int, eyes: Int, legs:Int, blood:String)

}

  abstract class Mammal(name: String, arms:Int, legs:Int, eyes:Int, blood: String) extends Animal(name, arms, legs, eyes, blood) {

  def Monkey: Unit = {
  val eyes = 2
  val legs = 2
  val arms = 2
  val name = "Monkey"
  val blood = "Hot blooded"
}


  if (name == "Monkey") {
  println (s"A Monkey is a $blood has $eyes eyes $legs legs $arms arms")
}

  object Prompt {

    def ask(message: String): String = StdIn.readLine(message)

    val question: String = Prompt.ask(Question1())
    println(Prompt.ask(""))

    def Question1(): String = "Pick a type of Animal"
  }

}