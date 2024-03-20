# 일단정렬하고
import sys

def input():
    return sys.stdin.readline().rstrip()
n=int(input())

input_list=list(map(int,input().split()))

input_list.sort()

low=0
high=len(input_list)-1

al,ar=0,len(input_list)-1
min_number=sys.maxsize
while low<high:
    mid=input_list[low]+input_list[high]
    #0에 가까운 값이니까 절댓값 계산 을 해야한다 .
    if abs(min_number)>abs(mid):
        min_number=mid
        al=low
        ar=high
        if(mid==0) : break
        # mid 값이 0 보다 작다면 +값을 증가시켜줘야겠쥬 ?
    if mid<0:
        low+=1
    else:
        high-=1

print(input_list[al],input_list[ar])


