#https://www.hackerrank.com/challenges/string-construction/problem

def stringConstruction(s)
    read_chars = Set.new
    s.split('').select do |c| 
        contains = read_chars.include?(c)
        read_chars.add(c)
        !contains
    end.size
end