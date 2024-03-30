### 유사하다
# 유사하게 풀면 안되나?
### 정렬 되어서 주어질 필요는 없을 거같은뎅
import sys
def input():
    return sys.stdin.readline().rstrip()

def program():
    # N은 코인 종류
    N = int(input())
    coins=list(map(int,input().split()))
    target=int(input())
    # !  최종 목적지만 필요하고 행마다 실행이니 이번에는 1차원으로..!
    #? 첫줄을 어떻게 채우지.. 동일하게 ? 0으로부터 받아와서 더해~~
    count_list=[0]*(target+1)
    count_list[0]=1
    for coin in coins:
        for t in range(1,target+1):
            if t-coin<0:
                count_list[t] = count_list[t]
            else:
                count_list[t] = count_list[t]+count_list[t-coin]
    print(count_list[-1])


#
test_case = int(input())
for _ in range(test_case):
    program()









