#https://www.hackerrank.com/challenges/permutation-equation/problem

def permutationEquation(p)
    ys = (1..(p.size)).map { |y| [p[p[p[y - 1] - 1] - 1], y] }.to_h
    p.map { |x| ys[x] }
end