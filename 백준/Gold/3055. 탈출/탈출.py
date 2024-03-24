### 큐에 넣는건 물과 고슴도치 ?
## 우선순위 큐??
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

X,Y = map(int, input().split())

td_map=[]
for _ in range(X):
    rows=list(map(str,input()))
    td_map.append(rows)
# print(td_map)

time_map=[[1e9 for _ in range(Y)] for _ in range(X)]
# print(time_map)
#고슴도치 위치는 배열에 담아서 나중에 큐에 전달해줘야지.... 물이 먼저 돔!

end_dot=[]
water_dot=[]
q=deque()
for x in range(X):
    for y in range(Y):
        if td_map[x][y] == 'S':
            time_map[x][y]=0
            q.append([x,y])
        if td_map[x][y] == '*':
            time_map[x][y] = -1
            water_dot.append([x, y])
        if td_map[x][y] =='X':
            time_map[x][y]=-2
        if td_map[x][y] == 'D':
            end_dot+=[x,y]

end_x=end_dot[0]
end_y=end_dot[1]
[q.append(x) for x in water_dot]
dx=[-1,1,0,0]
dy=[0,0,-1,1]
pivot = 0
while q:
    # print(*time_map, sep='\n')
    # print(*td_map, sep='\n')

    cx,cy=q.popleft()

    if cx == end_x and cy == end_y:
         break
    for i in range(4):
        nx,ny=cx+dx[i],cy+dy[i]
        if 0<=nx<X and 0<=ny<Y:
          if time_map[nx][ny] !=-2:
            # 물어서 꺼낸건 false 로 바뀌어있으니까 여긴 true가 고슴도치가 갈곳.
            if time_map[nx][ny]!=-1 and time_map[cx][cy]!=-1:
                new_cost=time_map[cx][cy]+1
                if new_cost<time_map[nx][ny]:
                    time_map[nx][ny]=new_cost
                    q.append((nx, ny))
                    if ny == end_y and nx == end_x:
                        pivot = 1
                        break
            elif td_map[cx][cy]=='*' and td_map[nx][ny] != 'D' and td_map[nx][ny]!='*':
                td_map[nx][ny]='*'
                time_map[nx][ny]=-1
                q.append((nx,ny))
    if pivot:
        break

if pivot:
    print(new_cost)
    exit()
print("KAKTUS")



