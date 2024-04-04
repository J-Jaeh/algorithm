# 정수쌍의 갯수 찾기
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol():
    n,m = map(int,input().split())
    count=0
    for b in range(1,n):
        for a in range(1,b):
            temp=(a**2+b**2+m)
            if temp%(a*b)==0:
                count+=1
    return count

if __name__ == '__main__':
    N=int(input())
    for _ in range(N):
        print(sol())