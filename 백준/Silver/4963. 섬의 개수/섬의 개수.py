# 섬의 갯수를 세는프로그램
# 이거 ..흠...
#
import sys
sys.setrecursionlimit(10**9)

dx=[-1,1,0,0]
dy=[0,0,-1,1]
ddy=[1,1,-1,-1]
ddx=[1,-1,-1,1]
def input():
    return sys.stdin.readline().rstrip()

def program():
    a,b = map(int, input().split())
    if a==0 and b==0:
        exit()
    #그래프만들기 행열을 그래프라고생각
    graph=[list(map(int, input().split())) for _ in range(b)]
    # print("ㄱ", *graph, sep='\n')

    count_island=0
    # 방문 배열 만들기 그래프를 변경하면 되니까 필요없을듯
    for y in range(b):
        for x in range(a):
            if graph[y][x]==1:
                graph[y][x]=-1
                #함수실행
                count_island+=dfs(y,x,b,a,graph)
    print(count_island)

## 이제 대각선 탐색만 추가하자 !
def dfs(y,x,b,a,graph):
    # print("ㄱ", *graph, sep='\n')
    # 상하좌우 탐색
    for i in range(4):
        ny,nx=y+dy[i],x+dx[i]
        if 0<=ny<b and 0<=nx<a:
            if graph[ny][nx]==1:
                graph[ny][nx]=-1
                # print(f'{y=} {x=}')
                dfs(ny,nx,b,a,graph)
    # 대각방향 탐색
    for i in range(4):
        ny, nx = y + ddy[i], x + ddx[i]
        if 0<=ny<b and 0<=nx<a:
            if graph[ny][nx]==1:
                graph[ny][nx]=-1
                # print(f'{y=} {x=}')
                dfs(ny,nx,b,a,graph)
    return 1


while True:
    program()