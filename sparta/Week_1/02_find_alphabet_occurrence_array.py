
# 각 알파벳별 빈도 수 반환 ;;배열
def find_alphabet_occurrence_array(string):
    alphabet_occurrence_array = [0] * 26

    for a in string:
        if not a.isalpha():
            continue
        alphabet_occurrence_array[ord(a)-ord('a')] += 1

    return alphabet_occurrence_array


print(find_alphabet_occurrence_array("hello my name is sparta"))