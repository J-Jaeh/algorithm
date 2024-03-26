##
##
import heapq
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

Y,X=map(int,input().split())

dx=[-1,1,0,0]
dy=[0,0,-1,1]

map=[list(map(int,input().split())) for _ in range(Y)]
# print(map)
def count_zero(x,y)->int:
    count=0
    for i in range(4):
        ny,nx=y+dy[i],x+dx[i]
        if 0<=nx<X and 0<=ny<Y:
            if map[ny][nx]==0:
                # print(f'{nx=} {ny=}', "주변 0의 좌표")
                count+=1
    # print(f'{count=} ')
    return count
def bfs(y,x,visit):
    # (0갯수 y,x 좌표)
    count_zero_list=[]
    # print(f'{x=} {y=}')
    q=deque([(y,x)])
    while q:
        # print("map이다", *map, sep='\n')
        y,x=q.popleft()
        # print(f'{zero=}')
        zero = count_zero(x, y)
        count_zero_list.append([zero,y,x])
        # print(count_zero_list)
        visit[y][x]=False
        for i in range(4):
            ny,nx=y+dy[i],x+dx[i]
            if 0<=nx<X and 0<=ny<Y:
                if visit[ny][nx] and map[ny][nx]!=0:
                    visit[ny][nx] = False
                    # print("방문이다", *visit, sep='\n')
                    q.append((ny,nx))
    ##리스트에서 꺼내서 조작하셈
    # print(*count_zero_list)
    for zero,y,x in count_zero_list:
        # print(f'{zero=} {y=} {x= }')
        map[y][x]=max(0,map[y][x]-zero)


# print(*map,sep='\n')
#
count=0
map_sum = sum(sum(x) for x in map)
while map_sum>0:
 for y in range(Y):
    for x in range(X):
        if map[y][x] !=0:
                ### 년 + (좌표)
                # 1. 방문좌표 만들어주고
                # print("지도",*map,sep='\n')
                visit=[[False for _ in range(X)] for _ in range(Y)]
                for i in range(Y):
                    for j in range(X):
                        if map[i][j] != 0:
                            visit[i][j]=True
                # print("방문배열",*visit,sep='\n')
                # 2. 큐돌아서 주변 0 갯수를 카운트 해준다.
                # print("map이다",*map,sep='\n'
                # print(f'{x=} {y=}')
                bfs(y,x,visit)
                    # 2-0 리스트에 [0갯수,y,x] 등록해준다
                    # 2-1. 카운트가 끝났음
                    # 2-2 리스트를 순회해서 원본 배열수정해준다.
                # 3 함수종료후 연결되어있는지 확인을 어떻게 할까유 ~
                    # 3-1 방문좌표에 True 가 남아있다면 종료
                # visit[0][0]=True
                visit_sum=sum(sum(x) for x in visit)
                # print("방문검사", *visit, sep='\n')

                if visit_sum>0:
                    print(count)
                    exit()
                else:
                    count+=1
                # print("map이다",*map,sep='\n')
                # print(count)
                map_sum =sum(sum(x) for x in map)
                # print(map_sum)
else:
 print(0)
 exit()
                # 주위에 0 갯수 , 좌표
