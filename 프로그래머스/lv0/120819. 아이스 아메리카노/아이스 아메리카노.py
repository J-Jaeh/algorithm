def solution(money):
    answer = [0,0]
    answer[0] = int(money/5500)
    answer[1] = money-int(money/5500)*5500
    return answer