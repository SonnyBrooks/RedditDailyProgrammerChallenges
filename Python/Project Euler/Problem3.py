# Problem 3
# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143?
import math
number = int(raw_input("Enter a number: "))
largestPrime = -1
while number % 2 == 0:
    largestPrime = 2
for i in xrange(3, int(math.sqrt(number)), 2):
    while number % i == 0:
        largestPrime = i
        number /= i
if number > 2:
    largestPrime = number
print largestPrime
# ANSWER: 6857