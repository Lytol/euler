Project Euler - Problem #7
==========================

**Problem:** What is the 10001st prime number?

**URL:** <http://projecteuler.net/index.php?section=problems&id=7>
**Language:** C

Approach
--------

Naive: Count forward from 1 and determine the primality of each number until you hit the 10001st prime. Wow, this seems to have an insane time complexity.
Better: For each number, attempt to divide by the list of existing primes to determine primality.  Oooh, this seems much better.
