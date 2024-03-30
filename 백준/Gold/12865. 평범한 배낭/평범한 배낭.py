## 배낭문제
## 아이디어는 LCS 아비슷하게..
## 블로그에서는 탑다운 바텀업 방식 다 구현했음
### 코인과 유시하게 코인이 밖에 for고 무게가 내부 for문
import sys
def input():
    return sys.stdin.readline().rstrip()

# N은 물품의 갯수 ,K 는 버틸수있는 무게
N,K = map(int,input().split())
inven=[]
for _ in range(N):
    W,V= map(int,input().split())
    inven.append((W,V))
# print(inven)
# visited=[True]*(N+1)
# visited[0]=False
value=[[0 for _ in range(K + 1)] for _ in range(N + 1)]

# print(*value,sep='\n')

# 이걸 코드로 어떻게 만들지 ?
## 1, 6번이 있고 없고 판단,
for i ,item in enumerate(inven):
    for bag in range(1,K+1):
        ## 현재 W가 가방에 들어갈수 있는지 없는지 판단
        if bag>=item[0]:
            plus_bag = bag-item[0]
            if plus_bag<0:
                plus_bag=0
            ## 들어갈수있다면 전보다 더 가치있는지 판단
            value[i+1][bag]=max(value[i][bag],value[i][plus_bag]+item[1])
            # print(plus_bag,*value, sep='\n')
        else:
            value[i+1][bag]=value[i][bag]







print(value[N][K])
