# ㅇㅎ... 이런 문제구나 위상정렬은...
## 모르겠어서 답지 보고 풀었다
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

#부품 갯수
N=int(input())
#정보 갯수
M=int(input())
graph=[[]for _ in range(N+1)]
greed=[0]*(N+1)

needs = [[0] * (N + 1) for _ in range(N + 1)]
for _ in range(M):
    a,b,c = map(int,input().split())
    graph[b].append((a,c))
    greed[a]+=1 # 큰부품으로로가는 화살표

##그래프를 다 그렸으면 하나씩 뽑아가야지 topology

q=deque()
basic_compo=[]
# cost={}
# for i in range(1,N+1):
#     cost[i]=0

# 그리디가 0 ,, 초기부품
for i in range(1,N+1):
    if greed[i] ==0:
        q.append(i)
        basic_compo.append(i)

while q:
    now_node=q.popleft()
    # print(f'{now_node=}')
    # print(graph[now_node])
    # 꺼냈으면 연결된애를 탐색 해야겠쥬 >
    for next_node,need in graph[now_node]:
        greed[next_node] -=1
        if now_node in basic_compo:
            needs[next_node][now_node]+=need
            # 중간부품이라면 ?
        else:
            for i in range(1,N+1):
                # 이해가 안가는 부분 ..!
                needs[next_node][i] += needs[now_node][i]*need

        if greed[next_node]==0:
            q.append(next_node)


# print(*needs,sep="\n")
for x in enumerate(needs[N]):
    if x[1] > 0:
        print(*x)



# print(needs)