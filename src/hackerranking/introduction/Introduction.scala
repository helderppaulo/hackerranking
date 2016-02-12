package hackerranking.introduction

/**
 * @author helder
 */
object Introduction {

  def main(args: Array[String]) {
    println(updatelist(List(-3, 4, -5, -6, 8)))
  }

  def solvemefirst() = println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)

  def helloworld() = println("Hello World")

  def helloworldNtimes(n: Int) = (1 to n).foreach(_ => helloworld())

  def listreplication(n: Int, arr: List[Int]): List[Int] = arr.map(x => (1 to n).map(_ => x)).flatten.toList

  def filterarray(delim: Int, arr: List[Int]): List[Int] = arr.filter(x => x < delim)

  def filterpositionsinalist(arr: List[Int]): List[Int] = arr.zipWithIndex.filter(x => x._2 % 2 == 1).map(x => x._1)

  def arrayofNelements(num: Int): List[Int] = (1 to num).toList

  def reversealist(arr: List[Int]): List[Int] = arr.reverse

  def sumofoddnumbers(arr: List[Int]): Int = arr.filter(_ % 2 != 0).sum

  def listlength(arr: List[Int]): Int = arr.map(_ => 1).sum
  
  def updatelist(arr:List[Int]):List[Int] = arr.map(x => x.abs)

}

