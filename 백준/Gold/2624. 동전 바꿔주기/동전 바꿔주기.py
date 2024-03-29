## 주어진 동전으로 목표금액 만드는 모든 가지수 출력
import sys
def input():
    return sys.stdin.readline().rstrip()

target=int(input())
coin_wallet=[]
for _ in range(int(input())):
    coin, count=map(int,input().split())
    coin_wallet.append((coin,count))


cost=[0]*(target+1)
cost[0]=1

## 코인 돌면서! 코인이 먼저for 돌아야 20~1까지 코인마다 탐색가능함
for c, a in coin_wallet:
    for i in range(target,0,-1):
        for j in range(a,0,-1):
            if i>=c*j>0:
                cost[i]+=cost[i-c*j]

print(cost[target])

