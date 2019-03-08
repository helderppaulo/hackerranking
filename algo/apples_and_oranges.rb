# https://www.hackerrank.com/challenges/apple-and-orange/problem
def countApplesAndOranges(s, t, a, b, apples, oranges)
    def count_fruits(s, t, tree_position, fruits_positions)
        fruits_positions
            .map { |x| x + tree_position }
            .select { |x| x >= s and x <= t }
            .size
    end
    puts count_fruits(s, t, a, apples)
    puts count_fruits(s, t, b, oranges)
end