import sys

n=int(input())

input_list=[int(sys.stdin.readline()) for _ in range(n)]
max_num=max(input_list)
min_num=min(input_list)
real_max = max(max_num, abs(min_num))

arr=[False]*((real_max)*2+1)

for i in input_list:
    arr[i+real_max]=True

for i in range(len(arr)):
    if arr[i]:
        print(i-real_max)