# Created by Andrew Budziszek on 12.27.15
# Challenge #239: A Game of Threes
# https://www.reddit.com/r/dailyprogrammer/comments/3r7wxz/20151102_challenge_239_easy_a_game_of_threes/
print 'Welcome to \'A Game of Threes\'!'
while True:
    number = raw_input("Enter a number('exit' to quit): ")
    if number == 'exit':
        break
    number = int(number)
    if number <= 0:
        break
    while number != 1:
        remainder = number % 3
        if remainder == 2:
            print '' + str(number) + ' +1'
            number += 1
        elif remainder == 1:
            print '' + str(number) + ' -1'
            number -= 1
        else:
            print '' + str(number) + ' 0'
        number /= 3
    print number
print 'Goodbye!'
