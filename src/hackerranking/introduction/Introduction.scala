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
  
  // Lambda Calculus - Reductions #2
  // ((λx.((λy.(x y))x))(λz.w))
  // [(λz.w)/x] = (λy.((λz.w) y)) (λz.w)
  // [(λz.w)/y] = ((λz.w) (λz.w))
  // [(λz.w)/z] = w

  // Lambda Calculus - Reductions #3
  // ((λx.(x x))(λx.(x x))) 
  // ((λx.(x x))(λy.(y y)))
  // [(λy.(y y))/x] = (λy.(y y)) (λy.(y y))
  // (λy.(y y)) (λz.(z z))                    // (1)
  // [(λz.(z z))/y] = (λz.(z z)) (λz.(z z))
  // (λx.(x x)) (λx.(x x))                    // (2)
  // (1) e (2) são iguais, vão substituir ad infinitum
  // CAN'T REDUCE
  
  // Lambda Calculus - Reductions #4
  // (λg.((λf.((λx.(f (x x)))(λx.(f (x x))))) g)) 
  // λg.(  (λf.( (λx.(f (x x))) (λx.(f (x x))) )) g)          // (1)
  // reduzindo ( (λx.(f (x x))) (λx.(f (x x))) )              // (2)
  // [(λx.(f (x x))) / x] = ( (λx.(f (x x))) (λx.(f (x x))) ) // (3)
  // (2) e (3) são iguais, vão substituir ad infinitum
  // CAN'T REDUCE
  
  // Lambda Calculus - Evaluating Expressions #1
  // (λx.x+1)3
  // [3/x] = 3+1 = 4

  // Lambda Calculus - Evaluating Expressions #2
  // (λx.x+1) ((λy.y+2)3)
  // [3/y] = (λx.x+1) (3+2)
  // [(3+2)/x] = (3+2)+1 = 6
  
  // Lambda Calculus - Evaluating Expressions #3
  // λx.λy.x^47y
  // por definição 47

  // Lambda Calculus - Evaluating Expressions #4
  //  λx.λy.x(xy)
  // por definição 2
  
  // Lambda Calculus - Evaluating Expressions #5
  // λx.λy.y
  // por definição 0
  
}

