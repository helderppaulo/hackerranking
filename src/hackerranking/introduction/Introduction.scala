package hackerranking.introduction

import Math.PI
import Math.pow

/**
 * @author helder
 */
object Introduction {

  def main(args: Array[String]) {
  }

  def solvemefirst() = println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)

  def helloworld() = println("Hello World")

  def helloworldNtimes(n: Int) = (1 to n).foreach(_ => println("Hello World"))

  def listreplication(n: Int, arr: List[Int]): List[Int] = arr.map(x => (1 to n).map(_ => x)).flatten.toList

  def filterarray(delim: Int, arr: List[Int]): List[Int] = arr.filter(x => x < delim)

  def filterpositionsinalist(arr: List[Int]): List[Int] = arr.zipWithIndex.filter(x => x._2 % 2 == 1).map(x => x._1)

  def arrayofNelements(num: Int): List[Int] = (1 to num).toList

  def reversealist(arr: List[Int]): List[Int] = arr.reverse

  def sumofoddnumbers(arr: List[Int]): Int = arr.filter(_ % 2 != 0).sum

  def listlength(arr: List[Int]): Int = arr.map(_ => 1).sum

  def updatelist(arr: List[Int]): List[Int] = arr.map(x => x.abs)

  def evaluatingex(x: Float): Float = {

    def factorial(n: Int): Int =
      if (n == 0 || n == 1) 1
      else n * factorial(n - 1)

    (0 to 9).map(i => Math.pow(x, i) / factorial(i)).sum.toFloat

  }

  // Area Under Curves and Volume of Revolving a Curve
  def f(coefficients: List[Int], powers: List[Int], x: Double): Double =
    coefficients.zip(powers).map(i => i._1 * Math.pow(x, i._2)).sum

  def area(coefficients: List[Int], powers: List[Int], x: Double): Double = 
    PI * pow(f(coefficients, powers, x), 2)

  def summation(func: (List[Int], List[Int], Double) => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List  [Int]): Double = {
    val length = 0.001
    ((lowerLimit / length).toInt to (upperLimit / length - 1).toInt).map(x => func(coefficients, powers, x * length) * length).sum
  }
  
  // Lambda Calculus - Reductions #1
  // ((λx.(x y))(λz.z))
  // [(λz.z)/x] = ((λz.z) y)
  // [y/z] = (y) = y
  

}

