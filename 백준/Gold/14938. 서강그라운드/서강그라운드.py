### 다익스트라
import heapq
import sys


### 그니까 결국 머냐 !! 머냐 !! 머냐 !! 시작위치에서 다 탐색해서 탐색범위보다 작은거 ..!1
def input():
    return sys.stdin.readline().rstrip()

#n은 지역 즉 노드갯수
# m 은 제한거리
# r 은 간선의 갯수

n,m,r=map(int,input().split())

# 두번째는 각 노드들 마다 획득할수잇는 아이템 갯수이다 !
item_list=list(map(int,input().split()))
##   이제 부터 ~
# 거리 테이블 만들기
distance_table=[1e9]*(n+1) # 0번 인덱스는 안사용 할꺼야 ! 어차피 heap 이 비어있으면 되니까 ~

# 그래프 만들기 노드 수많큼 그래프 만들기
map_graph=[[] for _ in range(n+1)]
# 그래프 채우기

for _ in range(r):
    # a 지역번호  b 지역번호  c거리
    a,b,c = map(int,input().split())
    ## 이건 내가 넣는 순서만 잘 기억하면 됨  이렇게 하면 되나요 ~?
    map_graph[a].append((b,c))
    # 양방향 할 필요는 없을듯 ! 필요함 ...  개빡치네
    map_graph[b].append((a,c))

# 다돌려봐야하는건가 ?
## 그러면  아 list 를 생성해서 반환해주면 되는건가 ..!!!!!
# 원본은 변하는거 없자나₩₩ 그치 ?
def diijk(start_node,distance_table):
    #시작 노드 생성하기
    h=[]
    # 이게 테이블 복사 임 !! [:]
    temp_table=distance_table[:]
    # ? 이렇게 하는게 아닌가 ? 왜 ..!!!!
    heapq.heappush(h,(0,start_node))
    ## 일단 힙에 두고 이제 해당하는 테이블에 거리를 0으로 초기화
    temp_table[start_node]=0
    # h가 모두 빌때까지 ? 반복 해서 테이블을 업데이트
    while h:
        cost,now_node=heapq.heappop(h)
        # 노드에는 0번이 노드번호 ,, 1번이 코스트
        if temp_table[now_node] < cost:
            continue
        for connect_node_info in map_graph[now_node]:
            ## 분기처리를 해줘야하는데... 거리 테이블보다 적은가격이면 pass ?
            new_cost = connect_node_info[1] + cost
            # 코스트 업데이트 와 함게 heqp에 넣는 작업이 필요할듯?
            ## 계산된 코스트와 테이블에 존재하는 코스트와 비교해서 값 업데이트
            if new_cost <temp_table[connect_node_info[0]]:
                temp_table[connect_node_info[0]]=new_cost
                heapq.heappush(h,(new_cost,connect_node_info[0]))
    return temp_table

max_item=0
for i in range(1,n+1):
    tem_max=0
    result=diijk(i, distance_table)
    for x in range(1,len(result)):
            if result[x]<= m:
                tem_max+=item_list[x-1]
    if max_item<tem_max:
        max_item=tem_max

print(max_item)

