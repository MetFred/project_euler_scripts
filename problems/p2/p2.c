#include <stdio.h>
int main() {
  unsigned int r = 0;
  unsigned int a = 1;
  unsigned int b = 2;
  while (a <= 4000000) {
    if (a % 2) r += a;
    b = a + b;
    a = b - a;
  }
  printf("%d", r);
}
