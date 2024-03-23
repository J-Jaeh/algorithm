##
# 대표적인 BFS 문제이다 ... 가중치가 동일하고.. 최단 거리를 구하는 문제
# 문제는 내가 그걸 구현 할 수 있냐 없냐
#
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

N,M= map(int,input().split())

# 그래프를 채울 배열을 생성
miro=[[] for _ in range(N)]
# 그래프를를 채우기 위한 여정 ... !!!!!
for i in range(N):
    strings=map(int,list(input()))
    miro[i]+=strings

# 0.0 행에 담길정보는? ()

# print(miro)
# 거리에 해당하는 방문 배열을 만들고 탐색을 진행하면 되는겅 ?
#distance=[[0]*M]*N   # ? 필요없는듯 ?!

# 상하 좌우.이동을 하기위해 탐색하는 배열 생성 배열의 길이가 4인이유 for문 한번에 상하 좌우를 다 탐색하기 위해서
dx=[-1,1,0,0]
dy=[0,0,-1,1]

# 0,0 부터 시작할꺼야
def dfs(x,y):
    # 큐를 만들어서
    # 바로 초기화해줘 큐야 큐큐 시작 하면 0,0
   Q = deque([(x, y)])
   #print(Q)
   while Q:
        x,y=Q.popleft()
        # 갈수있는 상하좌우를 탐색하기 위한 ㄱ과정!
        for i in range(4):
            x_dot=x+dx[i]
            y_dot=y+dy[i]
            # 갈수있는 범위 안에 존재하는지 체크  추가로 갈수 없는 0도 추가해!
            if x_dot<0 or y_dot <0 or  x_dot>=N or y_dot>=M or miro[x_dot][y_dot]==0:
                continue
            # 여긴 내가 탐험 할수있는 영역 탐험한 영역이 아닐 경우만 거리 업데이트
            if miro[x_dot][y_dot] == 1:
                miro[x_dot][y_dot]=miro[x][y]+1
                #
                Q.append((x_dot,y_dot))

   return miro[N-1][M-1]

print(dfs(0,0))




