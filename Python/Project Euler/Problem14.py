# Find the longest Collatz sequence under 1,000,000


def collatz(n):
    if n <= 1:
        return 0
    arr = [n]
    i = n
    while i != 1:
        if i % 2 == 0:
            i /= 2
        else:
            i = (3 * i) + 1
        arr.append(i)
    return len(arr)


longestChain = 0
startingNumber = -1
for x in xrange(1000001):
    currentChain = collatz(x)
    if currentChain > longestChain:
        longestChain = currentChain
        startingNumber = x
print 'Longest Chain: %d\nStarting Number: %d' % (longestChain, startingNumber)
