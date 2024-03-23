##
# 트리를 구성하고 재귀로 부모찾기 가능한가 ? 부모 저장은 딕셔너리로 하면되나 ?
##
import sys

sys.setrecursionlimit(10**9)
def input():
    return sys.stdin.readline().rstrip()

N=int(input())

# 그래프를 만들 배열

tree=[[] for _ in range(N+1)]

# 트리 ? 그래프 ? 생성 트리라고 했으니까 양방향 할 필요가 있을까 ? 근데 간선?
for _ in range(N-1):
    a,b = map(int,input().split())
    tree[a]+=[b]
    tree[b]+=[a]

# print(tree)
# 방문 배열
vis=[True]*(N+1)
vis[0]=False
vis[1]=False
answer=[-1]*(N+1)

# 이걸 BFS

def bfs(n):
    # 넘겨받은 arr을 다 방문했을때 종료조건아닐까 ?
    #for i in arr:
    if vis[n]:
        vis[n]=False
        return
    else:
        arr=tree[n]
        for i in arr:
            if vis[i]:
                vis[i]=False
                bfs(i)
                answer[i] = n

bfs(1)
for i in range(2,len(answer)):
    print(answer[i])
