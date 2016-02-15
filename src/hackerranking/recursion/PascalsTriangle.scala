package hackerranking.recursion

import scala.io.StdIn

/**
 * @author helder
 */
object PascalsTriangle {

  def pascal(x: Int): List[List[Int]] = {

    def pascalIter(row: Int, current: List[List[Int]]): List[List[Int]] = {
      if (row == x) current
      else {
        val lastRow = current.last
        val newRow = ((lastRow :+ 0), (0 :: lastRow)).zipped.map(_ + _)
        pascalIter(row + 1, current :+ newRow)
      }
    }

    pascalIter(1, List(List(1)))
  }

  def formatPascal(triangle: List[List[Int]]): String = {
    triangle.map(_ mkString " ") mkString System.lineSeparator()
  }

  def main(args: Array[String]) {
    println(formatPascal(pascal(StdIn.readInt())))
  }
}