# 그래프 bfs  DFS 탐색
import sys
from collections import deque


# 입력 받고 그래프 만들어서 bfs dfs 수행
def input():
    return sys.stdin.readline().rstrip()

N,M,V = map(int,input().split())

# 그래프 뼈대
graph=[[] for _ in range(N+1)]

not_visited_dfs= [True] * (N + 1)
not_visited_bfs= [True] * (N + 1)
not_visited_dfs[0]=False
not_visited_bfs[0]=False
for i in range(M):
    a,b =map(int,input().split())
    #양방향 연결
    graph[a]+=[b]
    graph[b]+=[a]
# print(graph)

# dfs 는 재귀로 구현하자!
dfs_list=[]
bfs_list=[]
def dfs(n):
    #필요한것?
    # 종료조건 들어오는게 마킹되어있으면 방문리스트에 추가해주고 return
    if sum(not_visited_dfs)==0:
        return
    else:
        sorted_nodes=sorted(graph[n])
        for i in sorted_nodes:
            if not_visited_dfs[i]:
                not_visited_dfs[i]=False
                dfs_list.append(i)
                dfs(i)
                #재  귀 호출
def bfs(n):
    Q = deque([n])
    while Q:
        c=Q.popleft()
        sorted_node=sorted(graph[c])
        for i in sorted_node:
            if not_visited_bfs[i]:
                not_visited_bfs[i]=False
                Q.append(i)
                bfs_list.append(i)



not_visited_dfs[V]=False
not_visited_bfs[V]=False
dfs_list.append(V)
bfs_list.append(V)
dfs(V)
bfs(V)
print(*dfs_list)
print(*bfs_list)

