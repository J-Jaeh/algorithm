## 3차원 배열인가 ?
#  [][][] 에바아닌가 .. 3차원배열을 이용해서 풀어야하는거면..
##
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

Y,X,H = map(int,input().split())

## 3차원 배열 만들기
# [[[0 for col in range(3)] for row in range(4)] for depth in range(2)]
box=[[list(map(int,input().split())) for _ in range(X)] for _ in range(H)]


# print(box)


dx=[-1,1,0,0,0,0]
dy=[0,0,-1,1,0,0]
dh=[0,0,0,0,-1,1]

Q=deque()
# 일단 cost 는 인덱스로 할 것이기 때문에 범위 조심히 사용하기
cost=[[[1e9  for _ in range(Y)] for _ in range(X)] for _ in range(H)]
count_zero=0
for h in range(H):
    for x in range(X):
        for y in range(Y):
            if  box[h][x][y] == 1:
                    Q.append((h,x,y))
                    cost[h][x][y]=0
            if box[h][x][y] == 0:
                count_zero+=1
            if box[h][x][y] == -1:
                cost[h][x][y]=-1

if count_zero==0:
    print(0)
    exit()

# print(Q) ## 잘 들어간다


# print(cost)

# cost 의 맥스 배열을 돌리자

while Q:
    c_h,c_x,c_y = Q.popleft()

    for i in range(6):
        n_h=c_h + dh[i]
        n_x=c_x + dx[i]
        n_y=c_y + dy[i]

        if 0<=n_h<H and 0<= n_x < X and 0<= n_y <Y :
            # - 1 이면 안됨
            if box[n_h][n_x][n_y] == -1:
                continue
            # 전진할 곳이 더 작다면 전진 할 필요가 없음
            new_cost=cost[c_h][c_x][c_y]+1
            if cost[n_h][n_x][n_y] > new_cost and cost[n_h][n_x][n_y] !=-1 :
                #이제는 바꿔 줘야할 때~ 보여줄 때~
                # box[c_h][c_x][c_y]=-2
                cost[n_h][n_x][n_y]=new_cost
                Q.append((n_h,n_x,n_y))


max_v=0
for h in range(H):
    for x in range(X):
        for y in range(Y):
            if max_v<cost[h][x][y]:
                max_v=cost[h][x][y]
            if cost[h][x][y]==1e9:
                print(-1)
                exit()


print(max_v)


