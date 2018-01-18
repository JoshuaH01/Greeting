package Calculator

  import scala.math._

  class Simplecalc {


    val button0: Int = 0
    val button1 = (1)
    val button2 = (2)
    val button3 = (3)
    val button4 = (4)
    val button5 = (5)
    val button6 = (6)
    val button7 = (7)
    val button8 = (8)
    val button9 = (9)

    def add(firstButton: Int, secondButton: Int): Int = {
       firstButton + secondButton
    }

    def subtract(button3: Int, button2: Int): Int = {
      3 - 2
    }

    def devide(button4: Int, Button2: Int): Int = {
      4 / 2
    }

    def multiply(button3: Int, Button2: Int): Int = {
      3 * 2
    }

    def power(value: Int, toPowerOf: Int): Int = {
      pow(value, toPowerOf).toInt
    }

      "butto1 add button2" should return { Int 3
    }

  }

