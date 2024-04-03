# 유튜브 보고풀음
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n):
    dp=[[0 for _ in range(10)] for _ in range(n+1)]
    # 1일때는 1가경우
    dp[1]=[1]*10
    # 그이후는 이전값 가져가지렁이
    for k in range(2,n+1):
        for i in range(10):
            dp[k][i]=(sum(dp[k-1][i:]))%10007
    # print(*dp,sep='\n')
    print(sum(dp[n])%10007)


if __name__=='__main__':
    sol(int(input()))