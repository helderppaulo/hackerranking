#https://www.hackerrank.com/challenges/repeated-string/problem

def repeatedString(s, n)
    m = n
    count = 0
    if n > s.size
        s_count = s.split('').count { |c| c == 'a'}
        m = n % s.size
        count += (s_count * (n / s.size))
    end
    s[(n % s.size) - m, m].split('').count { |c| c == 'a'} + count
end