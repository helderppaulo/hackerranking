#https://www.hackerrank.com/challenges/find-digits/problem

def findDigits(n)
    n.to_s.split('').count { |x| x != '0' and n % x.to_i == 0 }
end