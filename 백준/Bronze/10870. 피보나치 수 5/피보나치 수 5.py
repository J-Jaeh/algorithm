import sys
def input():
    return sys.stdin.readline().rstrip()


N=int(input())

if N==0:
    print(0)
    exit()
if N==1 or N==2:
    print(1)
    exit()

f=1
s=1

answer=0
for _ in range(3,N+1):
   a=f+s
   f=s
   s=a
   answer=a

print(answer)