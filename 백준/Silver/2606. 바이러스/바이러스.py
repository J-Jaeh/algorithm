# DFS 이용 깊이 우선 탐색
import sys
def input():
    return sys.stdin.readline().rstrip()

n=int(input())
v=int(input())
# 그래프를 배열로 표현하기 위해 초기화 ?
graph=[[] for i in range(n+1)]

visited=[False]*(n+1)

# 그래프 생성 .. 즉 연결된 노드? 들기리 연관성.

for i in range(v):
    a,b=map(int,input().split())
    graph[a]+=[b]
    graph[b]+=[a]


def dfs(v):
    # 일단 재귀로 들어오면 방문 표시함
    visited[v]=True
    # v는 ? v는 ? 숫자가 들어오는데 그럼 인덱스 리스트
    for x in graph[v]:
        if not visited[x]:
            dfs(x)


dfs(1)
print(sum(visited)-1)