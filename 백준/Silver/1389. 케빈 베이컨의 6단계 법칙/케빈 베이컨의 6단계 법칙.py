#그래프 탐색
# 다돌면서 숫자를 (베이컨의 합, 노드번호) 이렇게 우선순위 큐에 넣고 pop
import heapq
import queue
import sys
from collections import deque


def input():
   return sys.stdin.readline().rstrip()

def sol():
    N,E=map(int,input().split())

    graph=[[] for _ in range(N+1)]
    visited=[True]*(N+1)
    visited[0]=False

    for _ in range(E):
        a,b=map(int,input().split())
        graph[a].append(b)
        graph[b].append(a)

    q=[]
    for i in range(1,N+1):
       heapq.heappush(q, (bfs(i,visited,graph),i))

    return heapq.heappop(q)
def bfs(s,visited,graph)->int:
    temp_v=visited[::]
    ## 한번넣고 모두 탐색하기
    temp_v[s]=False
    total=0
    count=0
    q=deque()
    q.append((s,count))
    while q:
        s,count=q.popleft()
        for x in graph[s]:
           if  temp_v[x]:
            temp_v[x] = False
            q.append((x,count+1))
            total+=count+1

    return total


if __name__ == '__main__':
    print(sol()[1])


