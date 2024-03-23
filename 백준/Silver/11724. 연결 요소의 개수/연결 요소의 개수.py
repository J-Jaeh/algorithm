# 이거 .. 뭐로 풀든 상관없으니까 이해하기 쉬운 dequeq로 풀어보자 복습차원
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

N,M = map(int,input().split())

link_dot=[[] for _ in range(N+1)]
vis=[True]*(N+1)

for _ in range(M):
    u,v=map(int,input().split())
    link_dot[u]+=[v]
    link_dot[v]+=[u]

#print(link_dot)
#Q=deque([1])# 그냥 1번 닷먼저
#vis[1]=False
vis[0]=False
# 연결을 양방향으로 해주니까... 뭐라도 연결 되어있겠쥬?
count=0

for i in range(len(vis)):
    if vis[i]:
        Q = deque([i])
        count += 1
        vis[i]=False
        while Q:
            c=Q.popleft()
            for x in link_dot[c]:
                if vis[x]:
                    Q = deque([x])
                    vis[x]=False


print(count)