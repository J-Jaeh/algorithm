# for 문 돌면서 전체 탐색하고 방문트리를 초기화하는 개념으로 하면 될듯한데
import sys
def input():
    return sys.stdin.readline().rstrip()

# 노드수
N=int(input())

# S E 리스트
S_t_E=list(input())

#그래프 만들기
graph=[[] for _ in range(N+1)]
for _ in range(N-1):
    a,b=map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


def bfs(n,visit,count):
    visit[n]=False
    rv=0
    if S_t_E[n-1]=="1":
        # print(*S_t_E)
        count+=1
        # print("들어옴")
        if count==2:
            # print("들어옴종료조건")
            return 1

    for x in graph[n]:
        if visit[x]:
          # print(f'{n=} 에서 나온노드 {x=}')
          # visit[x]=False
          # print(*visit)
          rv+=bfs(x,visit,count)
    return rv

answer=0
for i in range(1,N+1):
    if S_t_E[i-1]=="1":
        # bfs 시작 할때마다 방문 배열 초기화 시켜주기
        visit = [True for _ in range(N + 1)]
        visit[0] = False
        #bfs 돌리기
        #실내거점 카운트
        count=0
        answer+=bfs(i,visit,count)

print(answer)