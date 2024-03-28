import sys

def input():
    return sys.stdin.readline().strip()



n=int(input())
dp=[0]*(n+1)

for i in range(2,n+1):
    # 자연스래 증가하는 값.. 이것은
    ## 1로 채워짐
    dp[i] = dp[i-1]+1
    ## 2로 나누어질때?
    if i % 2 == 0:
        dp[i] = min(dp[i],dp[i//2] + 1)
    # 3으로 나누어질때.
    if i % 3 ==0:
        dp[i] = min(dp[i],dp[i//3] + 1)
    # print(dp)

print(dp[n])