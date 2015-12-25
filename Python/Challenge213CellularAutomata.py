# Created by Andrew on 12/24/15.
# Reddit Daily Programmer Challenge #213: Cellular Automata: Rule 90
# https://www.reddit.com/r/dailyprogrammer/comments/3jz8tt/20150907_challenge_213_easy_cellular_automata/

print("Challenge #213: Cellular Automata - Rule 90")
while True:
    number = raw_input("Enter a number('exit' to quit): ")
    if number == 'exit':
        break
    if len(number) <= 2:
        continue
    for i in xrange(100):
        converted = ''
        for q in xrange(len(number)):
            if number[q] == '1':
                converted += 'x'
            else:
                converted += ' '
        print(converted)
        nextLine = ''
        for j in xrange(len(number)):
            window = ''
            if j == 0:
                window = '0' + number[:2]
            elif j == len(number) - 1:
                window = number[j - 1:] + '0'
            elif j - 1 == 0:
                window = number[:3]
            else:
                window = number[j - 1:j + 2]
            if (window[0] == '1' and window[2] == '0') or (window[0] == '0' and window[2] == '1'):
                nextLine += '1'
            else:
                nextLine += '0'
        number = nextLine

print("Goodbye!")

