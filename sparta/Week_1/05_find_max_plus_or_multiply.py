input = [0, 3, 5, 6, 1, 2, 4, 0]
# 페이스북 기출문제..!
# 내풀이
def find_max_plus_or_multiply(array):
    index_count=1
    sum_value = array[0]
    for a in array:
        if sum_value*array[index_count] > (sum_value + array[index_count]):
            sum_value = sum_value*array[index_count]
            index_count +=1
            if index_count ==len(array):
                break
        else:
            sum_value =(sum_value + array[index_count])
            index_count +=1
            if index_count ==len(array):
                break

    return sum_value


result = find_max_plus_or_multiply(input)
print(result)

#강사님풀이
def find_max_plus_or_multiply(array):
    multiply_sum = 0
    for number in array:
        if number <= 1 or multiply_sum <= 1:
            multiply_sum += number
        else:
            multiply_sum *= number
    return multiply_sum


result = find_max_plus_or_multiply
print("정답 = 728 현재 풀이 값 =", result([0,3,5,6,1,2,4]))
print("정답 = 8820 현재 풀이 값 =", result([3,2,1,5,9,7,4]))
print("정답 = 270 현재 풀이 값 =", result([1,1,1,3,3,2,5]))
