#https://www.hackerrank.com/challenges/cut-the-sticks/problem

def cutTheSticks(arr)
    cuts = []
    while(arr.size > 0)
        cut_size = arr.min
        cuts << arr.size
        arr.delete(cut_size)
        arr.map! { |x| x - cut_size }
    end
    cuts
end