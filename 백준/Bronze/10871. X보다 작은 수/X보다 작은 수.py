import sys

a,b=map(int,input().split())

c =[]
# 배열이 완성됨?
arr = list(map(int,sys.stdin.readline().split()))

for n in arr:
    if n<b :
        c.append(n)

print(*c)