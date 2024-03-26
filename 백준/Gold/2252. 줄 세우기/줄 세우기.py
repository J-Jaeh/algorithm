## 위상정렬 기본문제
import sys
from collections import deque


def input():
    return sys.stdin.readline().rstrip()

# N 학생수 / M 키 비교횟수
N,M = map(int,input().split())

# 키비교 횟수에서 gargh를 만들고 degree 를 추가함
indegree=[0]*(N+1)
indegree[0]=-1
graph=[[] for _ in range(N+1)]
# print(indegree)
for _ in range(M):
    a,b=map(int,input().split())
    ## a랑 b 가 연결되어있다
    graph[a].append(b)
    ## a가 b로 연결되어야해서 indegree로 표현 a가 먼저 나올 수 있도록
    indegree[b]+=1

def topology_sort():
    # 원리는 알자나 ..
    q=deque()
    answer=[]
    for i in range(1,N+1):
        if indegree[i]==0:
            q.append(i)

    while q:
        start=q.popleft()
        answer.append(start)
        # 꺼낸 애가 가리키고 있는 차수의 디그리를 감소 == 간선제거
        for x in graph[start]:
            indegree[x]-=1
            if indegree[x]==0:
                q.append(x)

    return answer


print(*topology_sort())