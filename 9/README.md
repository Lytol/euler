Project Euler - Problem #9
==========================

**Problem:** 

a*a + b*b = c*c
a + b + c = 1000

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

**URL:** <http://projecteuler.net/index.php?section=problems&id=9>
**Language:** Haskell

Approach
--------

Fetch every tuple of (a,b,c) where:
  a + b + c = 1000
  c > a
  c > b
  a,b,c > 0
  a,b,c < 998

Reduce the set to where:
  a^2 + b^2 = c^2
