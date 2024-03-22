import heapq
import sys


def input():
    return sys.stdin.readline().rstrip()


N = int(input())
answer = []
for _ in range(N):
    N = int(input())
    if N == 0:
        if len(answer) == 0:
            print(0)
        else:
            print(heapq.heappop(answer)[1])
    else:
        heapq.heappush(answer, (-N, N))
