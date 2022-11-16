def solution(n):
    rev_count = 2
    for a in range(1,int(n/2)):
        if a*a ==n:
            rev_count -=1
    return rev_count