import heapq
import sys

def input():
    return sys.stdin.readline().rstrip()


def sol():
    h=int(input())
    ranking_list=[]
    for i in range(h):
        a,b=map(int,input().split())
        heapq.heappush(ranking_list,(a,b))

    f,s=heapq.heappop(ranking_list)
    count=1
    standard = s
    while ranking_list:
         a,b = heapq.heappop(ranking_list)
         # 기준이 더크면 바꿔줘
         if standard>b:
            count+=1
            standard = b
    return count

if __name__ =='__main__':
    test_case=int(input())
    for _ in range(test_case):
        print(sol())