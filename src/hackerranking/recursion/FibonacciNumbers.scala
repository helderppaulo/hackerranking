package hackerranking.recursion

import scala.io.StdIn

/**
 * @author helder
 */
object FibonacciNumbers {

  def fibonacci(x: Int): Int = x match {
    case 1 => 0
    case 2 => 1
    case x => fibonacci(x - 1) + fibonacci(x - 2)
  }

  def main(args: Array[String]) {
    println(fibonacci(StdIn.readInt()))
  }
}