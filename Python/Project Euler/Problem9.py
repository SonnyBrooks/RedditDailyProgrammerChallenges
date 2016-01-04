# Problem 9
# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
#
# a^2 + b^2 = c^2
# For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
#
# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.
import math
import time

num = int(raw_input("Enter a number to find Pythagorean Triplet for which a + b + c = your number: "))
start = time.time()
for a in xrange(num + 1):
    for b in xrange(num + 1):
        c = math.sqrt(a**2 + b**2)
        if a + b + c == 1000.00 and a < b < c:
            print 'a: %d\nb: %d\nc: %d\nProduct: %d' % (a, b, c, a*b*c)
            print 'Running Time: %dms' % (time.time() - start)
            exit(1)
print 'Not found...'
print 'Running Time: %dms' % (time.time() - start)
