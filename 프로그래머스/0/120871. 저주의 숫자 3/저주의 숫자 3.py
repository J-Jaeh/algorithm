# 조건
# 3의 배수면 안되고, 3이 들어가면 안됨 그때마다 가중치를 줌
def solution(n):
    index =0
    answer =0
    while index !=n:
        answer+=1
        if answer%3==0 or '3' in str(answer):
            continue
        if '3' not in str(answer):
            index+=1
    return answer

if __name__ == '__main__':
        print(solution(40))




