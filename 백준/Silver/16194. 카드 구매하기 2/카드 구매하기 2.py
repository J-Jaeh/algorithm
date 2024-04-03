#카드구매하기 최솟값버전
## 1차원으로 시도해도 될듯
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol():
    N=int(input())
    input_list=list(map(int,input().split()))
    # 최솟값 가져가는거니까 0,1e9로
    dp=[1e9]*(N+1)
    dp[0]=0
    for i,money in enumerate(input_list,start=1):
        for j in range(N+1):
            if j-i>=0:
                dp[j]=min(dp[j],money+dp[j-i])
                # print(dp)

    # print(dp)
    return dp[N]

if __name__=='__main__':
    print(sol())