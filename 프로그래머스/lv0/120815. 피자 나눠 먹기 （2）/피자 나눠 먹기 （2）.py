def solution(n):
    for a in range(1,7):
        if int((n*a)%6) ==0:
            return int((n*a)/6)
        