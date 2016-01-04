# 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
#
# What is the sum of the digits of the number 2^1000?

num = 2**1000
num = str(num)
runningTotal = 0
for i in num:
    runningTotal += int(i)
print runningTotal
