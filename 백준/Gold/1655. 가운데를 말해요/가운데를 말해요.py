import sys
import heapq

def input():
    return sys.stdin.readline().rstrip()

max_h=[]
min_h=[]

def sol(n: int) -> int:
    # max_h에 먼저 넣어서 중앙값의 크기를 맞추도록 함
    heapq.heappush(max_h, -n)

    # max_h의 최대값이 min_h의 최소값보다 크다면 교환
    if min_h and -max_h[0] > min_h[0]:
        # 두 힙의 루트를 교환
        max_val = -heapq.heappop(max_h)
        min_val = heapq.heappop(min_h)
        heapq.heappush(max_h, -min_val)
        heapq.heappush(min_h, max_val)

    # 두 힙의 크기를 조정해서 균형 유지 gma @! 
    if len(max_h) > len(min_h) + 1:
        heapq.heappush(min_h, -heapq.heappop(max_h))
    elif len(min_h) > len(max_h):
        heapq.heappush(max_h, -heapq.heappop(min_h))

    return -max_h[0]



if __name__ == '__main__':
    tc =int(input())
    for _ in range(tc):
        print(sol(int(input())))