n = 600851475143
r = 0
for i in (3..(Math.sqrt(n))).step(2)
  while n % i == 0
    r = i
    n /= i
  end
end
puts(Integer(n > 2 ? n : r))
