def solution(n):
    answer = []
    for a in range(1,n+1):
        if n%a ==0:
            answer.append(a)
            
    return answer