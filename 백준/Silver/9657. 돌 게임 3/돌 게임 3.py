###
# dp 느낌나게 풀기
## 1==SK 2==CY
import sys
def input():
    return sys.stdin.readline().rstrip()

N=int(input())
ston=[0]*(N+1)

if N==1 or N==3 or N==4:
    print('SK')
    exit()
if N==2:
    print('CY')
    exit()

ston[1]=1
ston[2]=2
ston[3]=1
ston[4]=1

for i in range(5,N+1):
    if ston[i-1]==2 or ston[i-3]==2 or ston[i-4]==2:
        ston[i]=1
    else:
        ston[i]=2


print('SK' if ston[N]==1 else 'CY')

