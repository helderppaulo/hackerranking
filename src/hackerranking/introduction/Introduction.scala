package hackerranking.introduction

/**
 * @author helder
 */
object Introduction {

  def main(args: Array[String]) {
    println(listreplication(4, List(1,2,3)))
  }

  def solvemefirst() = println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  
  def helloworld() = println("Hello World")
  
  def helloworldNtimes(n: Int) = (1 to n).foreach(_ => helloworld())
  
  def listreplication(n: Int, arr: List[Int]): List[Int] = arr.map(x => (1 to n).map(_ => x)).flatten.toList

}

