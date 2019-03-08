#https://www.hackerrank.com/challenges/migratory-birds/problem

def migratoryBirds(arr)
    arr
        .inject(Hash.new(0)) { |h, e| h[e] += 1 ; h }
        .max_by { |k,v| v + (5 - k).to_f / 5 }
        .first
end