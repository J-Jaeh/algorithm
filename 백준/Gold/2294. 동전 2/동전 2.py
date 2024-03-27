## 재귀 + for 문
## bfs니까 ..... for 문이 아니라 넓이 우선 탐색 == 최솟값 !! ! ! !
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()


n ,k = map(int,input().split())

coin_list=[int(input()) for _ in range(n)]

coin_list.sort()
# print(coin_list)
count=0
#일단 큐에 다 담고 돌리기 보통의 생각은 이거겠지만
## 목표값을 코인에 넣고 돌리기
# 아 이런 방법이 있구나 그러면 동일 깊이는 같이 가는구나
q=deque([(k,count)])

duplicated_list=set()
while q:
    # print(q)
    target,count = q.popleft()
    count += 1
    # 타겟을 계속 업데이트 시켜주면 안됨 그니까 for 한번 돌때는 같은 값이 들어가야함
    for x in coin_list:
        temp=target
        temp-=x
        if temp ==0:
            print(count)
            exit()
        elif temp <0:
            break
        else:
            if temp not in duplicated_list:
                duplicated_list.add(temp)
                q.append((temp,count))
else:
    print(-1)
    exit(0)





