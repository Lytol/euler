#include <stdio.h>

#define MAX_PRIME 10001

int main() {
  int primes[MAX_PRIME];
  int index = 0;
  int i, j;
  unsigned char isPrime;

  for(i = 2; index < MAX_PRIME; i++) {
    isPrime = 1;

    for(j = 0; j < index; j++) {
      if(i % primes[j] == 0) {
        isPrime = 0;
        break;
      }
    }

    if(isPrime) {
      primes[index] = i;
      ++index;
    }
  }

  printf("10001st Prime: %d\n", primes[MAX_PRIME - 1]);

  return 0;
}
