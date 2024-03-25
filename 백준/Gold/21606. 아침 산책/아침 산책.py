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

def bfs(n)->int:
    count=0
    # visit[n]=False
    for x in graph[n]:
      if visit[x]:
        visit[x] = False
        # 주변 인접한 실외는 재귀로 들어가기
        if S_t_E[x-1]=="0":
            #값을 리턴 받고싶은디..
           count +=bfs(x)
        else:
            if S_t_E[x-1]=="1":
                count+=1
    return count
## 컨셉은 이해했다
## 시작노드에서 시작하는것이아닌 중심노드에서 갈수있는 노드의 갯수를 카운트 하는방식이다
visit = [True for _ in range(N + 1)]
visit[0] = False
answer=0
for i in range(1,N+1):
    # 실외 노드인 것만 돌려서 주변 노드수 카운트해서 경우의 수 계산 공식에 넣기
    if S_t_E[i-1]=="0":
       if visit[i]:
            visit[i]=False
            num=bfs(i)
            answer+=(num)*(num-1)
    #1인경우 주변노드 실내 탐색해서 카운트하기
    else:
        for k in graph[i]:
            if S_t_E[k-1]=="1":
                answer+=1

print(answer)