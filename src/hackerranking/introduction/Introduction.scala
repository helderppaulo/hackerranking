package hackerranking.introduction

/**
 * @author helder
 */
object Introduction {

  def main(args: Array[String]) {
    helloworld()
  }

  def solvemefirst() = println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  
  def helloworld() = println("Hello World")

}

