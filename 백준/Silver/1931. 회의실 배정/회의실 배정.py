## 회의실배정
import heapq
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol():
    ## 값이 주어지면... 끝나는 값 기준으로 heaque 넣기
    N=int(input())
    E,S=0,0
    h=[]
    for _ in range(N):
        start,end=map(int,input().split())
        heapq.heappush(h,(end,start))
    count=0
    while h:
        e,s=heapq.heappop(h)
        if E<=s:
            E,S=e,s
            count+=1
    return count

if __name__ == '__main__':
    print(sol())
