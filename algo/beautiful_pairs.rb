#https://www.hackerrank.com/challenges/beautiful-pairs/problem

def beautifulPairs(a, b)
    as = {}
    bs = {}
    count = 0
    (0..(a.size - 1)).each do |i|
        xa = a[i]
        xb = b[i]
        if bs[xa] and bs[xa] > 0
            bs[xa] -= 1
            count += 1
        else
            as[xa] = 0 if as[xa].nil?
            as[xa] += 1
        end
        
        if as[xb] and as[xb] > 0
            as[xb] -= 1
            count += 1
        else
            bs[xb] = 0 if bs[xb].nil?
            bs[xb] += 1
        end
    end
    if bs.values.sum > 0
        count += 1 
    else
        count -= 1
    end
    count
end