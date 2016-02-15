package hackerranking.recursion

import scala.io.StdIn.readLine

/**
 * @author helder
 */
object StringMingling {

  def mingle(a: String, b: String): String =
    (a, b).zipped.map(_ + "" + _).mkString

  def main(args: Array[String]): Unit = {
    println(mingle(readLine(), readLine()))
  }
}