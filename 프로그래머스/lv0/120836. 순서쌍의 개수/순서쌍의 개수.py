def solution(n):
    count = 0
    for a in range(1,n+1):
        if n%a ==0:
            count +=1
    return count