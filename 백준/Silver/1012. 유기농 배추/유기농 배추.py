## BFS로 불까 DFS로 풀까 고민되는 문제이다
import sys
from collections import deque


## 일단 큐에 넣고 탐색 하는게 좋지 않을깝 ?
def input():
    return sys.stdin.readline().rstrip()
## 5050 이면 뭐든 가능 하지 않을깝


# print(*baecu_map,sep='\n')
dx=[-1,1,0,0]
dy=[0,0,-1,1]

def bfs(q,baecu_map,M,N):
    while q:
        y,x=q.popleft()
        for i in range(4):
            ny,nx=y+dy[i],x+dx[i]
            if 0<=nx<M and 0<=ny<N:
                if baecu_map[ny][nx]==1:
                    baecu_map[ny][nx]=-1
                    q.append([ny,nx])

def print_answer():
    M, N, K = map(int, input().split())
    baecu_map = [[0 for _ in range(M)] for _ in range(N)]
    for i in range(K):
        a, b = map(int, input().split())
        baecu_map[b][a] = 1
    count=0
    for i in range(N):
        for j in range(M):
            if baecu_map[i][j]==1:
                baecu_map[i][j]=-1
                count+=1
                q=deque([(i,j)])
                bfs(q,baecu_map,M,N)
    print(count)

#
tests=int(input())
for _ in range(tests):
    print_answer()
