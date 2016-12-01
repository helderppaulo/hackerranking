a = gets.strip
b = gets.strip
as = a
bs = b
b.split('').each { |x| as = as.sub(x, '') }
a.split('').each { |x| bs = bs.sub(x, '') }
puts as.length + bs.length
