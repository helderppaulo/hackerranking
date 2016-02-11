package hackerranking.introduction

/**
 * @author helder
 */
object Introduction {

  def main(args: Array[String]) {
    helloworldNtimes(4)
  }

  def solvemefirst() = println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  
  def helloworld() = println("Hello World")
  
  def helloworldNtimes(n: Int) = (1 to n).foreach(_ => helloworld())

}

