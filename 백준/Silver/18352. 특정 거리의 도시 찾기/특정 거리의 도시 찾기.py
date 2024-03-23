###
#


# 특정 거리에 위치하는 도시 찾기 일단 만든다음에 ..
# k 값가지 가는것만 탐색 플로우가 k 값만큼 가는 것만 정답에 답고 정렬해서 출력?
##

# 시작 도시부터 각 도시까지의 최단거리ㅡㄹ 모두 확인한 후 k 와 일치하는 도시만 출력해주면 됨 ?
# 미쳤자나 !

import sys
from collections import deque


def intput():
    return sys.stdin.readline().rstrip()

#N 도시수 M 단방향 도로수  K 최단거리 X 출발도시
N,M,K,X = map(int,input().split())

# 단방향 트리 만들기  결국 그래프... ?!!?!??!?
# 단방향은 방문 리스트를 안만들어도 되는것?
# 양방향 중복 체크를 빼려고 만든것?
link_map=[[] for _ in range(N+1)]

not_vis=[True]*(N+1)
not_vis[X]=False
# 그래프 만들기

for _ in range(M):
    A,B = map(int, input().split())
    #단방향이니까 A->B
    link_map[A].append(B)

# print(link_map)
# 찾아야할... 시작도
Q=deque([X])
distance=[0]*(N+1)
answer=[]
k=1

while Q:
    # 찾아야할 도시
    c=Q.popleft()

    for nx in link_map[c]:
        if not_vis[nx]:
            not_vis[nx] = False
            Q.append(nx)
            distance[nx] = distance[c] +1
            if distance[nx]==K:
                answer.append(nx)
if not answer:
    print(-1)
else:
    sorted_answer=sorted(answer)
    print(*sorted_answer, sep='\n')
