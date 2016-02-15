package hackerranking.recursion

/**
 * @author helder
 */
object ComputingTheGCD {

  def gcd(x: Int, y: Int): Int = {

    def gcdIter(l: Int, s: Int): Int = {
      val remainder = l % s
      if (remainder == 0) s else gcdIter(s, remainder)
    }

    gcdIter(Math.max(x, y), Math.min(x, y))
  }

  /**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair: List[Int]) = {
    println(gcd(pair.head, pair.reverse.head))
  }

  def main(args: Array[String]) {
    /** The part relates to the input/output. Do not change or modify it **/
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x => x.toInt).toList)

  }
}