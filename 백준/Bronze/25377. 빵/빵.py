#Qjd
import sys


def input():
    return sys.stdin.readline().rstrip()

N=int(input())

a_list=[]

for _ in range(N):
 A,B = map(int,input().split())
 if A<=B:
    a_list.append(B)

if not a_list:
    print(-1)
else:
     a_list.sort()
     print(a_list[0])