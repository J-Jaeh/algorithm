# 1버전에서 업그레이드
# 규칙 찍어맞추기느낌
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n):
    dp=[0]*1001
    dp[1]=1
    flag=1
    for i in range(2,n+1):
        dp[i]=((dp[i-1]*2)%10007+flag)%10007
        flag*=(-1)
    return dp[n]

if __name__ == '__main__':
    N=int(input())
    print(sol(N))

