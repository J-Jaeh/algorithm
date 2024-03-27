## 큐로 탐색할껀데
## 하나의 위치를 큐로 담아서 탐색
## 정하면 될듯 양 or 늑대
## 갯수 카운트하고 한번탐색에서 판단해서 글로벌에 더해주기 !
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()


R,C= map(int,input().split())

map=[list(input()) for _ in range(R)]
# print(*map,sep='\n')

# 방문배열을 만들어서 중복카운트를 방지
visit=[[True for _ in range(C)] for _ in range(R)]

# print(*visit,sep='\n')
live_s=0
live_w=0

q=deque()
d=[(1,0),(-1,0),(0,1),(0,-1)]
for y in range(R):
    for x in range(C):
        # 늑대는 탐색하면서 늑대 갯수랑 양 갯수를 카운트하면됨.
        if (map[y][x]=='v'or map[y][x]=='o')and visit[y][x]:
            visit[y][x]=False
            q.append((y,x))
            temp_w = 0
            temp_s = 0
            if map[y][x]=='v':
                temp_w+=1
            else:
                temp_s+=1
            while q:
                # print("방문",*visit, sep='\n')
                cy,cx=q.popleft()
                for dy,dx in d:
                    ny,nx=cy+dy,cx+dx
                    if 0<=ny<R and 0<=nx<C:
                        if visit[ny][nx] and map[ny][nx]!='#':
                            visit[ny][nx]=False
                            q.append((ny,nx))
                            if map[ny][nx]=='o':
                                temp_s+=1
                            if map[ny][nx]=='v':
                                temp_w+=1

            if temp_w >= temp_s:
                live_w+=temp_w
            else:
                live_s+=temp_s

print(live_s,live_w)