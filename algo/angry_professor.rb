#https://www.hackerrank.com/challenges/angry-professor/problem

def angryProfessor(k, a)
    (a.count { |x| x <= 0 } >= k) ? 'NO' : 'YES'
end