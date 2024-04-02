##  rccode.tistory.com/155 코드 참고
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol():
    N=int(input())

    # 오... 첫값만 필요하고 나머지는 행렬 곱셈이니까 ..? 똑똑이심?
    nums = list(map(int, input().split()))

    for _ in range(N-1):
        _, c = map(int, input().split())
        nums.append(c)

    dp =[[0 for _ in range(N)] for _ in range(N)]
    for d in range(N):
        for i in range(N-d):
            j=i+d
            if i==j:
                continue
            dp[i][j]=float('inf')
            for k in range(i,j):
                dp[i][j] = min(dp[i][j],dp[i][k]+dp[k+1][j]+nums[i]*nums[k+1]*nums[j+1])

    print(dp[0][N-1])


if __name__== '__main__':
    sol()
