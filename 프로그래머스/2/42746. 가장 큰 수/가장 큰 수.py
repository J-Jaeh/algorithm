from functools import cmp_to_key


def compare(x: str, y: str):
    # 예시 x = 3 이거 y는 30일때..
    # x+y가 커서 x가 앞에와야 된다는 뜻은 330이자나 이게 더 크고 그럼 x 가앞에 와야하고 이때 -1
    if x + y > y + x:
        return -1 # 즉 x+y 가 더 크면 x가 앞에 와야함
    elif x + y < y+x :
        return 1 # y+x가 더 크면 y가 앞에 와야함
    else:
        return 0  # 같으면 변경없음


def solution(numbers):
    str_numbers = list(map(str,numbers))
    str_numbers.sort(key=cmp_to_key(compare)) # 시간복잡도 O(NlogN)

    answer=''.join(str_numbers)
    if answer[0] != '0':
        return answer
    else:
        return '0'
