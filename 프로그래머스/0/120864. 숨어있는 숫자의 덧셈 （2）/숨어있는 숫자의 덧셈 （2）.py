def solution(my_string):
    answer = 0
    # char_list = list(my_string)
    temp = ''

    for char in my_string:
        if char.isdigit():
            temp += char
        else:
            if temp != '':
                answer += int(temp)
                temp = ''
    if temp != '':
        answer += int(temp)

    return answer