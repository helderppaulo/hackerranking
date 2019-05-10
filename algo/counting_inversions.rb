#https://www.hackerrank.com/challenges/ctci-merge-sort/problem

def merge_sort(input)
    def join_sorted(a, b) 
        a_index = 0
        b_index = 0
        s = []
        inversions = 0
        (a.size + b.size).times do |_|
            if (a_index < a.size and (b_index >= b.size or (a[a_index] <= b[b_index])))
                s << a[a_index]
                a_index += 1
            elsif (b[b_index])
                s << b[b_index]
                b_index += 1
                inversions += (a.size - a_index)
            end
        end
        { arr: s, inversions: inversions }
    end

    def indexed_merge_sort(arr, i, j)
        return { arr: arr[i, (j-i)], inversions: 0 } if (j - i) <= 1
        l = indexed_merge_sort(arr, i, i + (j - i)/2)
        r = indexed_merge_sort(arr, i + (j - i)/2, j)
        s = join_sorted(l[:arr], r[:arr])
        { arr: s[:arr], inversions: l[:inversions] + r[:inversions] + s[:inversions] }
    end

    indexed_merge_sort(input, 0, input.size)[:inversions]
end