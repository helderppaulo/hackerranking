#https://www.hackerrank.com/challenges/picking-numbers/problem

def pickingNumbers(a)
    counts = a.inject(Hash.new(0)) { |a,e| a[e] += 1; a }
    counts.keys.sort
        .each_cons(2)
        .select { |a,b| b - a == 1 }
        .map { |a,b| counts[a] + counts[b]  }
        .+(counts.values)
        .max
end