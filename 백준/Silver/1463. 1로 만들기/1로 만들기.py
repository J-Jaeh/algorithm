## 역으로 바텀업 연습해보자
# 1에서 시작 3곱하고 2곱하고 1곱하고
## 방문배열만들어서 체크...
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

N=int(input())

count=0
Q=deque([(0,1)])
visit=[True]*(N+1)
# print(len(visit))
while True:
    #c = count m s=목표값.
    c,s=Q.popleft()
    count=c
    # print(s)
    if s==N:
        break
    else:
        # print(s*3)
        if s*3<=N and visit[s*3]:
          visit[s * 3]=False
          Q.append((c+1,s*3))
        if s*2<=N and visit[s*2]:
          visit[s * 2] = False
          Q.append((c+1,s*2))
        if s+1<=N and  visit[s+1]:
          visit[s + 1] = False
          Q.append((c + 1, s+1))


print(count)