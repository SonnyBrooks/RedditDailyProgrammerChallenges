# The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
#
# Find the sum of all the primes below two million.
import math


def is_prime(n):
    if n >= 2:
        for x in range(2, int(math.sqrt(n) + 1)):
            if not (n % x):
                return False
    else:
        return False
    return True

sumOfPrimes = 0
for i in xrange(2000001):
    if is_prime(i):
        sumOfPrimes += i
print 'Sum of primes up to n: %d' % sumOfPrimes
