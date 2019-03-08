def bricksGame(arr)

    def sum_scores(a, b)
        [a[0] + b[0], a[1] + b[1]]
    end

    def invert_player(current)
        (current + 1) % 2
    end

    def get_score(arr, i, j, current, best_moves)
        score = [0, 0]
        score[current] += arr[i, j].sum
        sum_scores(score, best_moves[[i + j, invert_player(current)]])
    end

    best_moves = {}
    (0..(arr.size - 1)).reverse_each do |i|
        [0,1].each do |current|
            config = [i, current]
            if i >= arr.size - 3
                score = [0, 0]
                score[current] += arr[i, arr.size - i].sum
            else
                scores = []
                scores << get_score(arr, i, 1, current, best_moves)
                scores << get_score(arr, i, 2, current, best_moves)
                scores << get_score(arr, i, 3, current, best_moves)
                score = scores.max_by { |x| x[current] }
            end
            best_moves[config] = score
        end
    end

    puts "#{best_moves}"

    best_moves[[0, 0]].first
end

f = File.open('input09.txt')

cases = f.readline.strip.to_i

(1..cases).each do |_|
    n = f.readline.strip.to_i
    arr = f.readline.strip.split(' ').map(&:to_i)
    puts bricksGame(arr)
end
