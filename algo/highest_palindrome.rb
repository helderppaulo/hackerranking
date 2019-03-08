def highestValuePalindrome(s, n, k)
    a = s.split('')[0,n/2]
    b = s.split('').reverse[0,n/2]
    m = s.size.even? ? [] : [s[n/2]]
    c = []

    zipped = a.zip(b).map { |x| x[0] == x[1] ? 0 : 1 }
    diffs = zipped.sum
    remaining = zipped.map { |x| diffs -= x; diffs }

    puts "#{remaining}"

    (0..(n/2 - 1)).each do |i|
    	#puts "k: #{k} c: #{c}"
        left = k - remaining[i]
        if (a[i] == b[i])
            if (a[i] != '9' and left >= 2)
                c << '9'
                k -= 2
            else
                c << a[i]
            end
        else
            max = [a[i], b[i]].max
            if (max == '9')
                c << '9'
                k -= 1
            elsif (left >= 2)
                c << '9'
                k -= 2
            elsif (left >= 1)
                c << max
                k -= 1
            else
            	return -1
            end
        end
    end
    m = ['9'] if (k >= 1 and m.size > 0)
    [c, m, c.reverse].flatten.join
end