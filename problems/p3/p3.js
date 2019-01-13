//
// A3: Find the greatest prime factor of 600851475143
//
let n = 600851475143;
let r = null;
for (let i=3;i<Math.sqrt(n);i+=2) {
	while (n % i == 0) {
		r = i;
		n /= i;
  }
}
console.log(n > 2 ? n : r);
//
// --> 6857
//
