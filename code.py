def min_time(word):
    result = 0
    current = 0
    # If word is empty then time is 0
    if(len(word) == 0):
        return 0
    else:
        # Uppercase letters go from A:65 to Z:90 in ascii code
        word = word.upper()
        for letter in word:
            # Map the current ordinary value in ascii code to alphabet index so A = 0
            index = ord(letter) - 65

            # Calculate distance from current to index clockwise
            clockwise = abs(current - index)

            # Calculate distance from current to index anti clockwise
            anti_clockwise = 26 - abs(current - index)

            # Add the min value to the sum result
            result += min(clockwise, anti_clockwise)

            # Set current pointer to the current letter
            current = ord(letter) - 65
    return result


def main():
    print(f'Minimum time is {min_time("bryan")}')


main()
