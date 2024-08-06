import sys
import heapq

def input():
    return sys.stdin.readline().rstrip()

hq=[]

if __name__ == "__main__":
    tc =int(input())
    for _ in range(tc):
      num = int(input())
      if num ==0:
          if len(hq) ==0:
              print(0)
              continue
          print(heapq.heappop(hq))
          continue
      heapq.heappush(hq,num)