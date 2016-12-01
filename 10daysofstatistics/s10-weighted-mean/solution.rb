n = gets.to_i
xs = gets.split(' ').map(&:to_i)
ws = gets.split(' ').map(&:to_i)
wmean = (xs.zip(ws).map { |a,b| a * b }.reduce(&:+).to_f / ws.reduce(&:+)).round(1).to_f
puts wmean
