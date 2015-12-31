# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

currentNum = 0
smallestNumFound = False
while not smallestNumFound:
    currentNum += 20
    for x in range(1, 21):
        if currentNum % x != 0:
            break
        if x == 20:
            smallestNumFound = True
print currentNum
