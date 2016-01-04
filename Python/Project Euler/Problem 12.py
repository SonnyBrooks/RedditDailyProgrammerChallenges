# What is the value of the first triangle number to have over five hundred divisors?
import math


def find_num_divisors(n):
    num_divs = 0
    for x in xrange(1, int(math.sqrt(n))):
        if n % x == 0:
            num_divs += 1
    return num_divs * 2


def find_triangle(n):
    r_sum = 0
    for y in xrange(n):
        r_sum += y
    return r_sum

num_divisors = -1
i = 3
highest_number_of_divisors = -1
current = -1
while True:
    current = find_triangle(i)
    num_divisors = find_num_divisors(current)
    if highest_number_of_divisors < num_divisors:
        highest_number_of_divisors = num_divisors
        print 'Number of Divisors: %d\nCurrent Value: %d\n' % (highest_number_of_divisors, current)
    if num_divisors > 500:
        break
    i += 1
print 'Number of Divisors: %d\nValue: %d' % (num_divisors, current)
