#include <stdio.h>
#include <math.h>
int main() {
  unsigned long long int n = 600851475143;
  unsigned int r = 0;
  for (unsigned int i = 3;i < sqrt(n); i += 2) {
    while (n % i == 0) {
      r = i;
      n /= i;
    }
  }
  printf("%lu", n > 2 ? n : r);
}
