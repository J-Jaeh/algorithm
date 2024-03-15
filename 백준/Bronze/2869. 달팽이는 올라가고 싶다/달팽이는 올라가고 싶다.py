import sys

arr=list(map(int,sys.stdin.readline().split()))

A=arr[0]
B=arr[1]
V=arr[2]

count_day=(V-A)//(A-B)
remain_v=(V-A)%(A-B)
if remain_v<A and remain_v !=0:count_day+=1
print(count_day+1)