input = "1110100011011"

# ... 답지 인데 이해 안가넹..
#왜 무조건 처음 숫자를 카운트 해주는거지..
# 아 일단 무조건 0 만들기 와 무조건 1 만들기를
#비고하는거구나 ... 그니까 걍 무조건 0일때는 1로 뒤집고 1일때는 0으로 뒤집는다 생각!
#복습이필요할듯
def find_count_to_turn_out_to_all_zero_or_all_one(string):
    count_to_all_zero = 0
    count_to_all_one = 0

    if string[0] == '0':
        count_to_all_one += 1
    elif string[0] == '1':
        count_to_all_zero += 1

    for i in range(len(string) - 1):
        if string[i] != string[i + 1]:
            if string[i + 1] == '0':
                count_to_all_one += 1
            if string[i + 1] == '1':
                count_to_all_zero += 1

    return min(count_to_all_one, count_to_all_zero)


result = find_count_to_turn_out_to_all_zero_or_all_one(input)
print(result)