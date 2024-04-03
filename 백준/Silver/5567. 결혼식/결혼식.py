## bfs로 1부터 거리가 2인곳까지만 탐색 2인게 나오면 break?
import sys
from collections import deque

def input():
    return sys.stdin.readline().rstrip()

def bfs():
    N=int(input())
    e=int(input())
    graph=[[] for _ in range(N+1)]
    visited=[False]*(N+1)
    visited[1]=True
    for _ in range(e):
        a,b = map(int,input().split())
        graph[a].append(b)
        graph[b].append(a)

    q=deque()
    count=0


    q.append((count,1))


    while q:
        c,n=q.popleft()
        if c==2:
            break
        for x in graph[n]:
            if not visited[x]:
                visited[x]=True
                q.append((c+1,x))

    return sum(visited)-1


if __name__ == '__main__':
    print(bfs())