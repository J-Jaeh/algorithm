def solution(n):
    # 흠 .. x 제곱 이 n 이라면
    if n ==1: return 4
    x=1
    while(x<n):
        temp=x
        temp=temp**2
        if temp == n:
            return (x+1)**2
        x+=1
    return -1