# 최소스패닝트리가 떠오르는 문제
# 최소스패닝트리의 원리를 이용한 문제이다
# 신장트리 특성상 연결된 하나의 간선만 끊으면 2개의 신장트리를 만들수 있다는
# 따라서 신장트리를 만들고 신장트리에서 가장 비싼 값을 빼면..!?
# 흠!

import sys
def input():
    return sys.stdin.readline().rstrip()

v,e = map(int,input().split())

#부모테이블을 만드는데 7개가 있으니까 7개를만들어야겠쥬 ?~
parent=[0]*(v+1)
for i in range(len(parent)):
    parent[i]=i
# print(parent)

## 부모를 찾는 연산
def find_p(p,x):
    #부모가 아니라면 부모를 찾으러감
    if p[x]!=x:
        p[x]=find_p(p,p[x])
    return p[x]


# union 연산
def union_p(p,a,b):
    a=find_p(p,a)
    b=find_p(p,b)
    if a>b:
        p[a]=b
    else:
        p[b]=a
    # print(parent)
## 간선정보를 담아야하는데 여기서 중요한점은 비용을 앞에 담아야한다는점

edges=[]
cost=0
# 간선 정보를 받아서 정렬시키기
for _ in range(e):
    a ,b, co=map(int,input().split())
    edges.append((co,a,b))
edges.sort()
last_node=0
## 간성정보 확인하면서 크루스칼 알고리즘 수행
for i,info in enumerate(edges):
    co,a,b=info[0],info[1],info[2]
    if find_p(parent,a) != find_p(parent,b):
        union_p(parent,a,b)
        cost+=co
        last_node=co

print(cost-last_node)