# The sum of the squares of the first ten natural numbers is,
#
# 1^2 + 2^2 + ... + 10^2 = 385
# The square of the sum of the first ten natural numbers is,
#
# (1 + 2 + ... + 10)^2 = 552 = 3025
# Hence the difference between the sum of the squares of the first ten natural numbers
# and the square of the sum is 3025 - 385 = 2640.
#
# Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
import math

sumOfSquares = 0
squareOfSums = 0
for x in xrange(101):
    sumOfSquares += math.pow(x, 2)
    squareOfSums += x
squareOfSums = math.pow(squareOfSums, 2)
print "%d - %d = %d" % (squareOfSums, sumOfSquares, squareOfSums - sumOfSquares)
