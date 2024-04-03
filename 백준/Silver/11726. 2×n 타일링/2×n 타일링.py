## 규칙만들어볼려다 실패
##
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n):
    dp=[0]*1001
    dp[1]=1
    dp[2]=2
    for i in range(3,n+1):
        dp[i]=(dp[i-1]%10007+dp[i-2]%10007)%10007

    return dp[n]

if __name__=='__main__':
    N=int(input())
    print(sol(N))
