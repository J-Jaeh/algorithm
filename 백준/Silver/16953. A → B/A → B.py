import sys
import heapq
def input():
    return sys.stdin.readline().rstrip()


def bfs(a:int,target:int)->int:
    q=[]
    count=0
    heapq.heappush(q,(a,count))
    while q:
        number ,count = heapq.heappop(q)
        if number == target:
            return count +1

        num_case_one = number*2
        num_case_two = number*10+1
        # print(f'a={num_case_one} b={num_case_two}')
        heapq.heappush(q,(num_case_one,count+1))
        heapq.heappush(q,(num_case_two,count+1))
        if q[0][0] > target:
            break
    return -1



if __name__ =='__main__':
    A,B = map(int,input().split())
    print(bfs(A,B))
