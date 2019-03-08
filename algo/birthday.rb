#https://www.hackerrank.com/challenges/the-birthday-bar/problem

def birthday(s, d, m)
    s.each_cons(m).count { |sub| sub.sum == d }
end