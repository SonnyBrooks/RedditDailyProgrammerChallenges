# Created by Andrew Budziszek on 2.3.2020
# Challenge #380: Smooshed Morse Code 1
# https://www.reddit.com/r/dailyprogrammer/comments/cmd1hb/20190805_challenge_380_easy_smooshed_morse_code_1/
morseAlphabet = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.."
morseLookup = morseAlphabet.split(' ')


def smorse(word):
    morseString = ''
    for c in word:
        morseString += morseLookup[ord(c) - 97]
    print(morseString)


f = open("example.txt", "r")
for word in f.readlines():
    print(word.rstrip(), end='')
    print(": ", end='')
    smorse(word.rstrip())
