#https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

def beautifulDays(i, j, k)
    (i..j).count do |x| 
        y = x.to_s.reverse.to_i
        (x - y) % k == 0
    end
end