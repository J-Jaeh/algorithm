### 01 타일
# 제한 시간이 짧다. N이 크다
import sys
# 1하나 00 하ㅏㄴ
#  F(n) = F(n-1)+ F(n-2)
# n=1 n=2

## 메모리초과가 안뜰 방법을 생각해야함 ..!
## 메모리초과 해결하면 시간초과..!!!!! 나름 빠르다고생각했는데 다른 방법이 있나보다 
def input():
    return sys.stdin.readline().rstrip()

N=int(input())

# dp=[0]*(N+1)

if N==1:
    print(1)
    exit()
if N==2:
    print(2)
    exit()

num1=1
num2=2
answer=0
for _ in range(3,N+1):
    answer=(num2%15746+num1%15746)%15746
    num1=num2
    num2=answer

print(answer)
