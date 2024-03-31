## 나이트이동경로 유사
## 모두 한번에 큐에 넣고 돌리기 ?
import copy
import sys
from collections import deque
def input():
    return sys.stdin.readline().rstrip()
# def print(n):
#     return sys.stdout.write(str(n))

###--###

delta=[(2,1),(-2,1),(2,-1),(-2,-1),(1,2),(1,-2),(-1,2),(-1,-2)]
def bsf(q,visited,N,dot:list)->list:
    answer=[]
    stop_count=len(dot)
    # print(dot)

    while q:
       c,y,x =q.popleft()
       for dy,dx in delta:
           ny,nx= y+dy,x+dx
           if 0<ny<=N and 0<nx<=N and visited[ny][nx]:
               if (ny,nx) in dot:
                   # print(ny,nx)
                   answer.append((c+1,(ny,nx)))
                   stop_count-=1
               if stop_count==0:
                   return answer
               visited[ny][nx]=False
               q.append((c+1,ny,nx))

    return -1
def chess()->list:
    # N=판크기 M= 잡아야할 좌표
    N,M = map(int,input().split())
    sY,sX = map(int,input().split())
    # print(f'{sY=} {sX=}')
    visited=[[True for _ in range(N+1)] for _ in range(N+1)]
    visited[sY][sX]=False
    answer = []
    dot_list = []
    for _ in range(M):
        y,x = map(int,input().split())
        dot_list.append((y,x))

    q = deque()
    q.append((0, sY, sX))
    temp=[]
    temp+=(bsf(q, visited, N,dot_list))
    for y,x in dot_list:
        for i, item in enumerate(temp):
            if y==item[1][0] and x==item[1][1]:
                answer.append(item[0])

    return answer


if __name__ == '__main__':
    print(*chess())