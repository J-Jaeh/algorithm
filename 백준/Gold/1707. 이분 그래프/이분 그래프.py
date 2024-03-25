### 나중에 다시 돌아옴 !
## 짝 찾기 dfs
import sys

sys.setrecursionlimit(10**9)
def input():
    return sys.stdin.readline().rstrip()

# 테스트 케이스 수
N=int(input())
def dfs(n,visited,graph,flag):
    # # 노드 탐색 해야겠쥬 ?
    # print(f"{n=}")
    # # print("v")
    # print(*visited)
    # # print("g")1
    # print(*graph)
    # print()

    rv=''
    visited[n] = flag
    if 0 not in visited:
        # print("in 제로")
        return 'YES'
    else:
            for x in graph[n]:
                # print(f'{x=} {n= }')
                # print(*visited)
                # 노방문이라면.
                if visited[x] ==0:
                    visited[x]=-flag
                    # print(*visited)
                    rv=dfs(x,visited,graph,-flag)
                # 이걸 if랑 동일 로직을 태우면 안된다 플래그가 바뀜
                elif visited[x]!=visited[n]:
                    # print("conti")
                    continue
                elif visited[x]==visited[n]:
                    return 'NO'

    return rv
for _ in range(N):
    #함수 호출
    node,line=map(int,input().split())

    graph=[[] for i in range(node+1)]

    for _ in range(line):
        a,b=map(int,input().split())
        graph[a]+=[b]
        graph[b]+=[a]

    if node==1:
        print('NO')
        continue

    ## 1에서부터 시작된다는 보장이 없음 즉 모든 노드에 대해서 탐색을 해봐야 알 수있는문제
    ## 그중 하나라도 No 가 나온다면 바로 리턴하자
    visited = [0] * (node + 1)
    visited[0] = -2
    rs ='YES'
    for i in range(len(graph)):
        ## 여기서 방문 리스트를 초기화 시켜줌.
        if visited[i]==0:
            rs=dfs(i, visited, graph, 1)
            if rs=='NO':
                break
    print(rs)

