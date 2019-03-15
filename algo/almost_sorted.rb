#https://www.hackerrank.com/challenges/almost-sorted/problem

def almostSorted(arr)
    def can_be_sorted(arr, sarr, diffs)
        len = diffs.max - diffs.min + 1
        # puts "diffs: #{diffs} rev: #{arr[diffs.min, len].reverse} sorted: #{sarr[diffs.min, len]}"
        arr[diffs.min, len].reverse == sarr[diffs.min, len]
    end
    sarr = arr.sort

    difference_indexes = []
    (0..(arr.size - 1)).each do |i|
        difference_indexes << i if arr[i] != sarr[i]
    end

    if (difference_indexes.size == 0)
        puts 'yes'
    elsif (difference_indexes.size == 2)
        puts 'yes'
        puts "swap #{difference_indexes[0] + 1} #{difference_indexes[1] + 1}"
    elsif (can_be_sorted(arr, sarr, difference_indexes))
        puts 'yes'
        puts "reverse #{difference_indexes.min + 1} #{difference_indexes.max + 1}"
    else
        puts 'no'
    end  

end