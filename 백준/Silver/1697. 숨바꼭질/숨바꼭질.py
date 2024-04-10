import sys
from collections import deque
def input():
    return sys.stdin.readline().rstrip()

d=[1,-1,2]
visited=[True]*100001
def bfs(s,e)->int:
    visited[s] = False
    q=deque()
    time=0
    q.append((s,time))
    while q:
        now,time=q.popleft()
        # print(f'{now=} {time=}')
        if now == e:
            break
        else:
            for move in d:
                if move !=2:
                 new_move=now+move
                else:
                 new_move=now*move
                if 0<=new_move<=100000 and visited[new_move]:
                    visited[new_move]=False
                    # print(f'{new_move=}, {e=}, {time=}')
                    q.append((new_move,time+1))
    return time


if __name__ == "__main__":
    N,K = map(int,input().split())
    print(bfs(N,K))