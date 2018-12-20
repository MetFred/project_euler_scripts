#include <stdio.h>
int main() {
  int r = 0;
  for (int x=3;x<1000;x++) {
    r += x % 3 == 0 || x % 5 == 0 ? x : 0;
  }
  printf("%d", r);
}
