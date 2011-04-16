Project Euler - Problem #3
==========================

**URL:** <http://projecteuler.net/index.php?section=problems&id=3>
**Language:** Haskell


Prime Factorization
-------------------

If we want the prime factorization of n, we start by attempting modulus of 2 to n/2 and remove each factor. We should have a list of prime factors once we reach n/2.

Improvements:

- When finding the next factor, do not check against any even numbers other than 2
- When finding the next factor, only iterate up to the square root rounded down

