#https://www.hackerrank.com/challenges/the-hurdle-race/problem

def hurdleRace(k, height)
    [height.max - k, 0].max
end