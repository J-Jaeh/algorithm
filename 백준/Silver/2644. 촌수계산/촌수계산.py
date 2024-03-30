import sys
from collections import deque

def input():
    return sys.stdin.readline().rstrip()

def print(n):
    return sys.stdout.write(str(n))

def bfs() -> int:
    ## 노드수
    N = int(input())
    ##
    S, E = map(int, input().split())
    ##
    K = int(input())

    ###
    graph = [[] for _ in range(N + 1)]

    # print(graph)
    for _ in range(K):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
    # print(graph)

    q = deque()

    q.append((S, 0))

    visited = [True] * (N + 1)

    visited[0] = False
    visited[S] = False
    c = 0
    while q:
        S, count = q.pop()
        c = count
        if S == E:
            return c
        for x in graph[S]:
            if visited[x]:
                visited[x] = False
                q.append((x, count + 1))
    return -1

if __name__ == '__main__':
   print(bfs())
