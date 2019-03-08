def steps(n)
    n/5 + (n%5 + 1)/2
end

def equal_internal(arr, offset)
    min = arr.min
    arr.map { |x| steps(x - min + offset) }.sum
end

def equal(arr)
    [equal_internal(arr, 0), equal_internal(arr, 1), equal_internal(arr, 2), equal_internal(arr, 3)].min
end

f = File.open('inputx.txt')

t = f.readline.to_i

t.times do |t_itr|
    n = f.readline.strip.to_i

    arr = f.readline.strip.rstrip.split(' ').map(&:to_i)

    result = equal arr
    puts result
end



def countingValleys(n, s)
    current = 0
    valleys = 0
    inside = false
    s.split('')
        .map  { |x| x == 'D' ? -1 : x == 'U' ? 1 : 0 }
        .each do |m|
            puts "c: #{current} v: #{valleys} i: #{inside}"
            current += m
            if current < 0 and !inside
                valleys += 1  
                inside = true
            elsif current >= 0 and inside
                inside = false
            end
        end
    valleys
end

