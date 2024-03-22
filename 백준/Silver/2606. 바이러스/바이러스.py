import sys
from collections import deque

def input():
    return sys.stdin.readline().rstrip()

N= int(input())

# 앞으로 주어질 쌍의 갯수
K =int(input())

# 그래프 초기화 ?? 무슨 그래프인뎅 ? 아 연결 되어있으면 그래프라고 하나
graph=[[] for i in range(N+1)]
# 방문한 컴퓨터인지 표시
visited=[False]*(N+1)

#? 그래프 생성 ??

for i in range(K):
    a,b=map(int,input().split())
    # 양방향으로 연결이라는데 이렇게하면 어떻게 표시되는거 ?
    # 초기화된 리스트 안에 방문값이 양방향으로 합쳐지넹?
    # 양방향으로 하는 이유는 그래프가 무방향 그래프 이기 때문...
    # 즉.. 한 노드에서 다른 노드로 갈수있다는 뜻이니까.. 양쪽 노드 모두 방문처리를 ..
    graph[a]+=[b]
    graph[b]+=[a]

#print(graph)
# 무조건 1번부터 방문하니까 방문 표시
visited[1]=True

# ? ? 일단 큐에 1을 넣는다/
Q=deque([1])
# #
while Q:
    c=Q.popleft()
    # ? 이게 어떤 원리일까.. 일단 C는 1이겠지 ? 그럼 C와 연결된 애들이 호출되는거 ?
    for x in graph[c]:
        if not visited[x]:
            Q.append(x)# 일단 방문안하고 1에 연결된 애들을 첫번째로 다담아 !
            visited[x]=True

print(sum(visited)-1)