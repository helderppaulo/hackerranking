#https://www.hackerrank.com/challenges/drawing-book/problem

def pageCount(n, p)
    [(p / 2), ((n / 2) - (p / 2))].min
end