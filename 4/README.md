Project Euler - Problem #4
==========================

**Problem:** A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99. Find the largest palindrome made from the product of two 3-digit numbers.

**URL:** <http://projecteuler.net/index.php?section=problems&id=4>
**Language:** TBD


Determining Whether an Integer is Palindrome
--------------------------------------------

The simplest way to determine whether an integer is a palindrome would be to loop from front to back of the character string and return false once the characters don't match; otherwise, true once the front iterator equals the back iterator.

For Haskell, I can accomplish this same thing (although less efficiently) by taking the first half of the string (rounded down) and the reversed last half of the string and compare them. Less efficient for sure, but it's so easy!
