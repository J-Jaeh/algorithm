# 바이러스를 막아라
# 어떤 방법이 있을까 ?
# 1 바이러스가 있는 곳찾기 2 벽찾기 ?
# !!!!
## 백트레킹을 이용해 벽을 3개 세우는 경우의 수를 탐색 ..!
import copy
from collections import deque

dx=[-1,1,0,0]
dy=[0,0,-1,1]
import sys
def input():
    return sys.stdin.readline().rstrip()

N,M=map(int, input().split())

lap=[list(map(int,input().split())) for _ in range(N)]
# print(*lap,sep='\n')

## 백트레킹 이용한 ...기둥 세우기....
def make_wall(n):
    if n==3:
        #탐색 실행
        bfs()
        return
    for i in range(N):
        for j in range(M):
            if lap[i][j]==0:
                lap[i][j]=1
                make_wall(n+1)
                lap[i][j]=0
count_zero=0
def bfs():
    global count_zero
    virus=copy.deepcopy(lap)
    # print("바이러스",*virus,sep='\n')
    q=deque()
    ## 큐를에 바이러스를 모두 놓고 돌려야... bfs다.... 잊지말자 ..!
    for i in range(N):
        for j in range(M):
            if virus[i][j]==2:
                q.append((i,j))
    while q:
       y,x=q.popleft()
       for i in range(4):
            ny,nx=y+dy[i],x+dx[i]
            if 0<=ny<N and 0<=nx<M:
               if virus[ny][nx]==0:
                    virus[ny][nx]=2
                    q.append((ny,nx))
    temp=0
    #남은 0을 카운트..
    for i in range(N):
        temp+=virus[i].count(0)
    # print("바이러스",*virus,sep='\n')
    count_zero=max(temp,count_zero)

make_wall(0)
# print("2로 변경이 안되야함 ",*lap, sep='\n')
print(count_zero)