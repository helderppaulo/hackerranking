def countChanges(sum: Int, coins: List[Int]) : Long = {
    def internal(pairs: Seq[(Int,Int)], memo: Map[(Int,Int),Long]) : Long = {
        if(pairs.isEmpty) memo(sum, coins.length)
        else {
            // println(pairs.head)
            val pair = pairs.head
            pair match {
                case (0, _) => internal(pairs.tail, memo + (pair -> 1l))
                case (_, 0) => internal(pairs.tail, memo + (pair -> 0l))
                case _ => {
                    val change = evalChange(pair._1 - coins(pair._2 - 1), pair._2, memo) + 
                                 evalChange(pair._1, pair._2 - 1, memo)
                    internal(pairs.tail, memo + (pair -> change))
                }
            }
        }
    }

    def evalChange(n: Int, m: Int, memo: Map[(Int,Int), Long]) : Long = {
        // println(s"evaluating $n $m inside: $memo")
        if(n < 0) 0l
        else memo(n, m)
    }

    val pairs: Seq[(Int,Int)] = for(x <- (0 to sum); y <- (0 to coins.length)) yield (x,y)
    internal(pairs, Map())
}
