import sys

# 재귀 깊이 제한 설정
sys.setrecursionlimit(2000)

def solution(balls, share):
    f_v = recur(balls)
    s_v = recur(balls-share)
    t_v = recur(share)
    return f_v/(s_v*t_v)

def recur(input:int)->int:
    if input <= 1:
        return 1
    return input*recur(input-1)