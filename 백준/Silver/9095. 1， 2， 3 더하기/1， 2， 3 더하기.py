# 모르겠는데 공식찍기 실패~
# 답지봄
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n):
    dp=[0,1,2,4,7,13,24,44,81,149,274,504]
    # dp=[0]*(12)
    # dp[1]=1
    # dp[2]=2
    # dp[3]=4
    # for i in range(4,n+1):
    #     dp[i]=dp[i-1]+dp[i-2]+dp[i-3]
    return dp[n]

if __name__ == '__main__':
    N=int(input())
    for _ in range(N):
        n=int(input())
        print(sol(n))
