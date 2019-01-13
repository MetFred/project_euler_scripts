n = 600851475143
r = None
for i in range(3, int(n ** 0.5), 2):
	while n % i == 0:
		r = i
		n /= i
print(n if n > 2 else r)
