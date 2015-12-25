# Created by Andrew Budziszek on 12/25/15
# Challenge #235[EASY]: Ruth-Aaron Pairs
# https://www.reddit.com/r/dailyprogrammer/comments/3nkanm/20151005_challenge_235_easy_ruthaaron_pairs/


def factor_sum(n):
    return_sum = 0
    n = int(n)
    for i in range(2, n):
        if n % i == 0:
            return_sum += i
            while n % i == 0:
                n /= i
    return return_sum


while True:
    s = raw_input('Enter a tuple(\'exit\' to quit): ')
    if s == 'exit':
        break
    s = s.replace(')', '').replace('(', '').replace(' ', '')
    n1 = s.split(',')[0]
    n2 = s.split(',')[1]
    valid = False
    if factor_sum(n1) == factor_sum(n2):
        valid = True
    if valid:
        print s + " is VALID"
    else:
        print s + " is NOT VALID"
print "Goodbye!"
