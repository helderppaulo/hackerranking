package hackerranking.recursion

import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

import scala.io.StdIn

/**
 * @author helder
 */
object StringOPermute {
  def permute(s : String) : String = s.sliding(2, 2).map(_.reverse).toList.flatten.mkString
  
  def main(args: Array[String]): Unit = {
    val casesNumber = readInt()
    (1 to casesNumber).foreach(_ => println(permute(readLine())))
  }
}