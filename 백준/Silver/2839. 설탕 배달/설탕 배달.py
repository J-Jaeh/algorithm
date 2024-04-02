# 3 과 5는 배수관계가 아니다 따라서 그리디 최적해를 보장못함?1
# 따라서 dp 배열로 최솟값 업데이트
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n):
    dp=[1e9]*(n+1)
    kg=[3,5]
    ## 나눠지면 나눠지는 수로 업데이트,
    ## 안나눠진다면 - kg 위치에 있는 수가 1e9가 아니라면 가져와서 +1 굿?
    for k in kg:
        for t in range(n+1):
            if t%k ==0:
                dp[t]=t//k
            elif t-k>=0 and dp[t-k]!=1e9  :
                dp[t]=dp[t-k]+1

    if dp[n]==1e9:
        return -1
    else:
        return dp[n]
if __name__ == '__main__':
    N=int(input())
    print(sol(N))
