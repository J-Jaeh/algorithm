input = [3, 5, 6, 1, 2, 4]

#for - else 문 잘 이해하기..!

def is_number_exist(number, array):
    for a in array:       # array의 길이만큼 아래연산
        if number == a:   # 비교 연산 1번 실행
            return True   # N*1 = N만큼..
    else:
     return False



result = is_number_exist(6, input)
print(result)


