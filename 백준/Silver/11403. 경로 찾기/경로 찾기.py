## 배열로 받은걸 그래프로 만들까 ? 안만들어도 배열에대한 이해도만 있다면 금방 할듯하기도 하고 ?
## 양 방향도 아니니까 ... 방문배열을 만들 필요도 없고 그냥 도착하면 1 도착 못하면 0
import copy
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

N=int(input())

map=[list(map(int,input().split())) for _ in range(N)]
answer=[[0 for _ in range(N)] for _ in range(N)]
# print(*answer,sep='\n')

# print(*map,sep='\n')
graph=[[] for _ in range(N)]
visit=[True for _ in range(N)]

for i in range(N):
    for j in range(N):
        if map[i][j]==1:
            graph[j].append(i)
# print(graph)

# 그래프 탐색.... 뭘루 하냐 ..!
def bfs(start,end)->bool:
    q=deque()
    q.append(start)
    temp=copy.deepcopy(visit)
    while q:
        s=q.popleft()
        for x in graph[s]:
          if temp[x]:
            # print(f'{x=} {s= }')
            temp[x]=False
            if x==end:
                return True
            q.append(x)
    return False

for i in range(N):
    for j in range(N):
        if bfs(i,j):
            answer[j][i]=1
        else:
            answer[j][i]=0
for i in range(N):
    print(*answer[i])

# print(*answer,sep='\n')


