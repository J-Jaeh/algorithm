### 큐 이용해서 나이트 위치 넣고 이동할 것같은 거리 돌기 좌표가 도착지면 스탑
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

knight_work=[(2,1),(2,-1),(-2,1),(-2,-1),(1,2),(1,-2),(-1,2),(-1,-2)]

#? 방문한 곳은 방문할 필요가 없나 ?
def bfs(q:deque,Y,X,N,visited)->int:
   temp_map=visited[::-1]
   while q:
    count,cy,cx =q.popleft()
    temp_map[cy][cx]=False
    if cy==Y and cx==X:
        return count
    else:
        for dy,dx in knight_work:
            ny,nx=cy+dy,cx+dx
            if 0<=ny<N and 0<=nx<N and temp_map[ny][nx] :
                temp_map[ny][nx]=False
                q.append((count+1,ny,nx))

###
test_count = int(input())
for _ in range(test_count):
    size=int(input())
    sy,sx=map(int,input().split())
    ey,ex=map(int,input().split())
    q=deque()
    visited=[[True for _ in range(size)] for _ in range(size)]
    q.append((0,sy,sx))
    print(bfs(q,ey,ex,size,visited))
