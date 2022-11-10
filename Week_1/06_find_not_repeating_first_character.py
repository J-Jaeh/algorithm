input = "abadabac"

# 나는 이중 for문에서 ... 더 생각 못하겠다.
def find_not_repeating_character(string):
    aphabet_occurrence_array = [0] * 26

    for a in string:
        aphabet_occurrence_array[ord(a)-ord('a')] +=1

    count = -1
    select_chr =[]
    for b in aphabet_occurrence_array:
        count += 1
        if b ==1:
         select_chr.append(chr(ord('a')+count))

    print(select_chr)
    if count == 0:
        return '_'

    for c in string:
        if c in select_chr:
            return c

result = find_not_repeating_character(input)
print(result)

# 성생님 풀이는... if in? 이런것도 있네;;
def find_not_repeating_first_character(string):
    alphabet_occurrence_array = [0] * 26

    for char in string:
        if not char.isalpha():
            continue
        arr_index = ord(char) - ord("a")
        alphabet_occurrence_array[arr_index] += 1

    not_repeating_character_array = []
    for index in range(len(alphabet_occurrence_array)):
        alphabet_occurrence = alphabet_occurrence_array[index]

        if alphabet_occurrence == 1:
            not_repeating_character_array.append(chr(index + ord("a")))

    for char in string:
        if char in not_repeating_character_array:
            return char

    return "_"


result = find_not_repeating_first_character
print("정답 = d 현재 풀이 값 =", result("abadabac"))
print("정답 = c 현재 풀이 값 =", result("aabbcddd"))
print("정답 =_ 현재 풀이 값 =", result("aaaaaaaa"))