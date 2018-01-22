package Calculator

import scala.language.postfixOps
import scala.math._

  class Simplecalc {


    val button0: Int = 0
    val button1 = 1
    val button2 = 2
    val button3 = 3
    val button4 = 4
    val button5 = 5
    val button6 = 6
    val button7 = 7
    val button8 = 8
    val button9 = 9

    def add(firstButton: Int, secondButton: Int): Int = {
       firstButton + secondButton
    }

    def subtract(firstButton: Int, secondButton: Int): Int = {
      firstButton - secondButton
    }

    def devide(firstButton: Int, secondButton: Int): Int = {
      firstButton / secondButton
    }

    def multiply(firstButton: Int, secondButton: Int): Int = {
      firstButton * secondButton
    }

    def power(value: Int, toPowerOf: Int): Int = {
      pow(value, toPowerOf).toInt
    }

  }

//divided by its self. is the number a whole number no. show error, if true show int
//took a number split in to square factors.
//squared