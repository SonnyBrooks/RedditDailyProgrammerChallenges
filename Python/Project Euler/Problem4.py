# A palindromic number reads the same both ways. The largest palindrome made from the product of
# two 2-digit numbers is 9009 = 91 x 99.
#
# Find the largest palindrome made from the product of two 3-digit numbers.

largestPalindrome = -1
theX = -1
theY = -1
for x in xrange(100, 999):
    for y in xrange(999, 100, -1):
        currentNum = str(x * y)
        if currentNum == currentNum[::-1] and int(currentNum) > int(largestPalindrome):
            largestPalindrome = currentNum
            theX = x
            theY = y
print largestPalindrome
# ANSWER: 906609

