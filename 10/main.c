#include <stdio.h>

// MAX_PRIME allocates WAY more space than we need, but whatever
#define MAX_PRIME 2000000

int main() {
  unsigned int primes[MAX_PRIME];
  unsigned int index;
  unsigned long int sum;
  unsigned int i, j;
  unsigned char isPrime;

  // Optimize slightly by adding 2 up front and then only checking odd numbers
  primes[0] = 2;
  index = 1;
  sum = 2;

  for(i = 3; i < 2000000; i += 2) {
    isPrime = 1;

    for(j = 0; j < index; j++) {
      if(i % primes[j] == 0) {
        isPrime = 0;
        break;
      }
    }

    if(isPrime) {
      sum += i;
      primes[index] = i;
      ++index;
    }
  }

  printf("Sum of primes to 2000000: %ld\n", sum);

  return 0;
}
