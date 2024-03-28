## 바텀업 방식으로 구현.. 합시다 ~
import sys

memo=[0]*91
def input():
    return sys.stdin.readline().rstrip()

memo[1]=1
memo[2]=1
def fibo(x):
    for i in range(3,x+1):
        memo[i]=memo[i-2]+memo[i-1]
    return memo[x]

print(fibo(int(input())))
