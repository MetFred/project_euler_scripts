r, a, b = 0, 1, 2
while a <= 4000000
    if a % 2 == 0
        r += a
    end
    b, a = a + b, b
end
puts(r)
