#https://www.hackerrank.com/challenges/kangaroo/problem

def kangaroo(x1, v1, x2, v2)
    return 'NO' if v2 == v1
    t = (x2 - x1).to_f / (v1 - v2)
    puts "t: #{t}"
    meet = (t == t.to_i and t.positive?)
    meet ? 'YES' : 'NO'
end