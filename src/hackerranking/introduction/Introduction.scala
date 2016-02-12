package hackerranking.introduction

/**
 * @author helder
 */
object Introduction {

  def main(args: Array[String]) {
    println(evaluatingex(20))
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

}

