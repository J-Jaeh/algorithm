
check=[False]*1001
for i in range(1,int(1000**0.5)+1):
    check[i**2]=True

def solution(left, right):
    # 소수라면 약수의 갯수는 짝수
    # 소수가 아니라면 ..? 따져봐야하는데
    # 이거 보니까 제곱수라면 홀수네 ?
    # 흠 n 이 주어졌을대 제곱인지 아닌지 판별하라 이말인디
    #
    answer = 0
    for num in range(left,right+1):
        if check[num]:
            answer-=num
        else:
            answer+=num
    return answer