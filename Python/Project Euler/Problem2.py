# Problem 2
# Each new term in the Fibonacci sequence is generated by adding the previous two terms.
# By starting with 1 and 2, the first 10 terms will be:
#
# 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
#
# By considering the terms in the Fibonacci sequence whose values do not exceed four million,
# find the sum of the even-valued terms.

current = 2
last = 1
numSum = 0
limit = int(raw_input("Enter the limit: "))
while current < limit:
    if current % 2 == 0:
        numSum += current
    temp = current
    current += last
    last = temp
print numSum
# ANSWER: 4613732
