### 큐가 아니라 우선순위 큐로
## 단지 흰방의 탐색 순위를 높게 해서 탐색한다
###

import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

# 결국 은 다익이다
# 다이익 필요하다면
N=int(input())

visited=[[1e9] * N for _ in range(N)]
w_b_dot=[[] for _ in range(N)]
for i in range(N):
    string_to_int=map(int,list(input()))
    w_b_dot[i]+=string_to_int

q = deque()
q.append((0, 0))
visited[0][0]=0
dx=[-1,1,0,0]
dy=[0,0,-1,1]

count=0
while q:
    x,y = q.popleft()
    for i in range(4):
        new_x=x+dx[i]
        new_y=y+dy[i]
        if 0<=new_x<N and 0<=new_y<N:
            if visited[new_x][new_y]>visited[x][y]:
                if  w_b_dot[new_x][new_y]==1:
                    visited[new_x][new_y]=visited[x][y]
                    q.append((new_x,new_y))
                else:
                    visited[new_x][new_y] = visited[x][y]+1
                    q.append((new_x, new_y))

#
print(visited[N-1][N-1])