## 큐로 풀수 있을 거같은뎅 ...
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()


M,N = map(int,input().split())

d=[(1,0),(-1,0),(0,1),(0,-1)]

box=[list(map(int,input().split())) for _ in range(N)]
visit=[[True for _ in range(M)]for _ in range(N)]

# print(*box,sep='\n')

## 전부 큐에 담은다음에 돌리기
q=deque()
for yb in range(N):
    for xb in range(M):
        if box[yb][xb]==1:
            q.append((yb,xb,0))
            visit[yb][xb]=False

# print(*visit,sep='\n')
tomato_day=0
while q:
     y,x,day=q.popleft()
     tomato_day=day
     for dy, dx in d:
         ny,nx=y+dy,x+dx
         if 0<=ny<N and 0<=nx<M:
             if visit[ny][nx] and box[ny][nx]!=-1:
                 box[ny][nx]=-1
                 # print(f'{ny=} {nx=}')
                 visit[ny][nx]=False
                 q.append((ny,nx,day+1))
for rows in box:
    if 0 in rows:
        print(-1)
        exit()
else:
    # print(*box,sep='\n')
    print(tomato_day)