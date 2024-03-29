## 문제를 읽자....
## 최댓값을 얻게 프로그래밍해야함
# 단 조건이 1칸을 연속해서 3번밟을 수 없음
import sys


# 한칸은 무조건 가고 그뒤에 앞에 두칸은 선택해서 올라갸아하는거 아닌가 ?
# flag 사용 ?
def input():
    return sys.stdin.readline().rstrip()

N=int(input())

stair_cost=[0]*(N+1)
for i in range(1,N+1):
    stair_cost[i]=int(input())

if N==1:
    print(stair_cost[1])
    exit()
if N==2:
    print(stair_cost[1]+stair_cost[2])
    exit()
    
cost=[0]*(N+1)
cost[1]=stair_cost[1]
cost[2]=stair_cost[2]+cost[1]
### 역으로 경우를 생각하고 아래서부터 시작하기...?
for i in range(3,N+1):
    ## fn = n-3(누적) + n-1(현재) vs n-2 (누적)
    cost[i]=max(cost[i-3]+stair_cost[i-1],cost[i-2])+stair_cost[i]

print(cost[N])
