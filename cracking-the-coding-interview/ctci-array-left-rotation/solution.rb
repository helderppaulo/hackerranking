n,k = gets.strip.split(' ').map(&:to_i)
xs  = gets.strip.split(' ').map(&:to_i)
puts (xs[k..(n - 1)] + xs[0..(k - 1)]).join(' ')
