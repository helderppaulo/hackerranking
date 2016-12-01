n = gets.to_i
xs = gets.split(' ').map(&:to_i).sort
mean = xs.reduce(0) { |a, e| a + e }.to_f / n
median = n.odd? ? xs[n / 2] : (xs[n / 2 - 1] + xs[n / 2]).to_f / 2
mode = xs.reduce(Hash.new(0)) { |a, e| a[e] += 1; a }
         .sort(& -> (a,b) { compare = a[1] <=> b[1]
                            compare != 0 ? compare : b[0] <=> a[0] }).last.first
puts mean
puts median
puts mode
