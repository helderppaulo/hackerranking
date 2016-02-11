package hackerranking.introduction

/**
 * @author helder
 */
object Introduction {

  def main(args: Array[String]) {
    println(filterpositionsinalist(io.Source.stdin.getLines().map(_.toInt).toList))
  }

  def solvemefirst() = println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)

  def helloworld() = println("Hello World")

  def helloworldNtimes(n: Int) = (1 to n).foreach(_ => helloworld())

  def listreplication(n: Int, arr: List[Int]): List[Int] = arr.map(x => (1 to n).map(_ => x)).flatten.toList

  def filterarray(delim: Int, arr: List[Int]): List[Int] = arr.filter(x => x < delim)

  def filterpositionsinalist(arr: List[Int]): List[Int] = arr.zipWithIndex.filter(x => x._2 % 2 == 1).map(x => x._1)

}

