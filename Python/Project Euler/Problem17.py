# If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19
# letters used in total.
#
# If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
#
#
# NOTE: Do not count spaces or hyphens. For example,
# 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
# The use of "and" when writing out numbers is in compliance with British usage.

tensNames = ['', 'ten', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety']

numNames = ['', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', 'ten', 'eleven', 'twelve',
            'thirteen', 'fourteen', 'fifteen', 'sixteen', 'seventeen', 'eighteen', 'nineteen']


def convert(num):
    num_string = ''

    if num % 100 < 20:
        num_string = numNames[num % 100]
        num /= 100
    else:
        num_string = numNames[num % 10]
        num /= 10
        num_string = tensNames[num % 10] + num_string
        num /= 10
    if num == 0:
        return num_string
    return numNames[num] + "hundredand" + num_string

i = 1000
running_str = 0
while i > 0:
    if convert(i) == 'tenhundredand':
        running_str += len('onethousand')
    else:
        running_str += len(convert(i))
        if convert(i).endswith('and'):
            running_str -= 3
    i -= 1
print running_str
