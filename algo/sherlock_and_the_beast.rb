#https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem

def decentNumber(n)
    def combine(pre, suf)
        if (suf.first == -1)
            [-1, -1]
        else
            a = [0, 0]
            a[0] = pre[0] + suf[0]
            a[1] = pre[1] + suf[1]
            a
        end
    end

    memo = {}
    memo[1] = [-1, -1]
    memo[2] = [-1, -1]
    memo[3] = [0, 3]
    memo[4] = [-1, -1]
    memo[5] = [5, 0]
    (6..n).each do |i|
        f = combine([0, 3] , memo[i - 3])
        s = combine([5, 0], memo[i - 5])
        best = [f, s].max_by { |x| x[1] * 100 + x[0] }
        memo[i] = best
    end
    result = memo[n]
    if (result[0] == -1)
        puts -1
    else
        puts (result[1].times.map { |_| '5' }.join + result[0].times.map { |_| '3' }.join)
    end
end