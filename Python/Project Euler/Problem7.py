import math


def is_prime(n):
    if n >= 2:
        for x in range(2, int(math.sqrt(n) + 1)):
            if not (n % x):
                return False
    else:
        return False
    return True


numberOfPrimes = 0
thePrimeNumber = -1
num = 2
while numberOfPrimes != 10001:
    if is_prime(num):
        numberOfPrimes += 1
        thePrimeNumber = num
    num += 1
print thePrimeNumber
print numberOfPrimes
