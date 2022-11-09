input = "hello my name isssssssssss sparta"


def find_max_occurred_alphabet(string):
    alphabet_occurrence_array = [0] * 26

    for a in string:
        if not a.isalpha():
            continue
        alphabet_occurrence_array[ord(a) - ord('a')] += 1

    max_value = 0
    count_value = 0
    for b in alphabet_occurrence_array:
        if max_value < b:
            max_value = b

    for c in alphabet_occurrence_array:
        if max_value != c:
            count_value += 1
        else:
            break

    return chr(count_value + ord('a'))


result = find_max_occurred_alphabet(input)
print(result)

