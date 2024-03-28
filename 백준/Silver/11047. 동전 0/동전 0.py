### 동전 배수라는 조건이 그리드 알고리즘의 최적해를 보장함?
import sys
def input():
    return sys.stdin.readline().rstrip()

N,K=map(int,input().split())

coin_list=[int(input()) for _ in range(N)]

count=0
while K!=0:
    coin=coin_list.pop()
    count+=K//coin
    K%=coin

print(count)