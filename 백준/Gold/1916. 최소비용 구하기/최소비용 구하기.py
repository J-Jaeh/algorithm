import heapq
import sys


# 일반 우선순위큐로 못푸는 다익스트라
# 다익스트라는 heqp을 이용해서 우선순위,,? 로 해야하나 ?
# 그래야할듯 ?
# 다익스트라로 구현 !
def input():
    return sys.stdin.readline().rstrip()

#도시의 갯수
N = int(input())

#버스의 갯수 ? 어디에다가 쓸일 이 있을까 ? -> 노선정보임
M = int(input())

# 출발 목적지의 관계가 명확하게 있는 것도 양방향으로 걸어줘야하는걸까 ?
cost_table=[1e9]*(N+1)

# 0 은 버려 버려 ~
city_graph=[[] for _ in range(N+1)]

# 그래프 만들기
for _ in range(M):
    a,b,c = map(int,input().split())
    # 일단 단방향으로
    city_graph[a].append((b,c))

start, end=map(int,input().split())
# 다익 구현하기
h=[]
heapq.heappush(h,(0,start))
#시작점 초기화
cost_table[start]=0
while h:
    cost,now_node =heapq.heappop(h)
    # 비교할 필요가 있는지 검사
    if cost_table[now_node]<cost:
        continue
    #연결된 노드들 꺼내자 ~~ 0번이 노드번호 1번이 노드 코스트
    for connected_node_info in city_graph[now_node]:
        new_cost=connected_node_info[1]+cost
        if new_cost<cost_table[connected_node_info[0]]:
            cost_table[connected_node_info[0]]=new_cost
            heapq.heappush(h,(new_cost,connected_node_info[0]))

print(cost_table[end])