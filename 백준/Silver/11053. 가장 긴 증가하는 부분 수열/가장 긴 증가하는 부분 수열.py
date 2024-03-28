import sys
#?
## 뭐지... 쭉 스캔하면 되는거아닌가?
### 안됨 ! 그러면 작은값들로 이루어진 증가수열을 놓침.. ?
def input():
    return sys.stdin.readline().rstrip()

N=int(input())

num_list=list(map(int,input().split()))

max_v=[1]*(N+1)
# last_index=[]  -> 나중에 더 개선할때 사용하기

for i in range(1,len(num_list)):
    for j in range(i):
        # 루프를 다돌았는데 자기보다 큰숫자만 있었다면... last_index에 현재 가장 큰 값의 인덱스를 저장시킴
        # pivot=True
        #i는 고정 j 비교
        ## j가 더 커야 되는거 아닌가 ? 아니네 ....!
        ## 내가 착각했다 i 가 j 보다 더 앞에 있다 ! j는 i까지..
        if num_list[i] >num_list[j]:
            max_v[i]=max(max_v[i],max_v[j]+1)

print(max(max_v))