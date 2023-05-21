input = [3, 5, 6, 1, 2, 4]


def find_max_num(array):
    max_value = 0
    for a in input:
       if max_value < a :
        max_value = a

    return max_value


result = find_max_num(input)
print(result)
'''
#이런 방법도 존재..?
def find_max_num(array):
    for num in array:
        for compare_num in array:
            if num < compare_num:
                break
        else:
            return num


print("정답 = 6 / 현재 풀이 값 = ", find_max_num([3, 5, 6, 1, 2, 4]))
print("정답 = 6 / 현재 풀이 값 = ", find_max_num([6, 6, 6]))
print("정답 = 1888 / 현재 풀이 값 = ", find_max_num([6, 9, 2, 7, 1888]))
'''