object Solution {

    def main(args: Array[String]) {
        val t = scala.io.StdIn.readInt()
        val fs = Range(0,t).map(_ => { 
            val n = scala.io.StdIn.readInt()
            Range(0,n).map(_ => {
                val f = scala.io.StdIn.readLine().trim().split(" ").map(x => x.toInt)
                (f(0), f(1))
            }).toList
        }).toList
        process(fs).foreach(println(_))
    }
    
    def process(fs: List[List[(Int, Int)]]): List[String] = 
        fs.map(c => c.groupBy(_._1)
                     .filter { case(k,v) => v.length > 1 }
                     .map(_._2.unzip._2.toSet.size == 1)
                     .foldLeft(true)(_ && _))
          .map(if(_) "YES" else "NO")
        
}
