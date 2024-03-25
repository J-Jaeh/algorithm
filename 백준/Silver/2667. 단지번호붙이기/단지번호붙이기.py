## 재귀로 푸는건가 스태긍로 푸는건가 !!
import sys

#### 노노해 !!!

## 재귀를 호출횟수를 카운트해서 배열에 담기 ?
def input():
    return sys.stdin.readline().rstrip()



N=int(input())

dangi_visited=[[True for _ in range(N)] for _ in range(N)]
dangi_map= []

for _ in range(N):
    strs=input()
    dangi_map.append(list(strs))

# print(*dangi_map,sep='\n')
# print(*dangi_visited,sep='\n')

max_visit=[]
def bfs(x, y, c):
    c += 1
    # 종료조건 탐색할 곳이 없을때 종료
    dx = [-1, 1, 0, 0]
    dy = [0, 0, -1, 1]
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        # 갈수 있으면 호출이고 도저히 갈곳이 없다! 이러면 break? return
        if 0 <= nx < N and 0 <= ny < N:
            if dangi_map[nx][ny] != "0" and dangi_visited[nx][ny]:
                dangi_visited[nx][ny] = False
                c=bfs(nx, ny, c)
    return c



call_count=0
answer=[]
for i in range(N):
    #함수 호출
    for j in range(N):
        if dangi_map[i][j] == "1" and dangi_visited[i][j]:
            dangi_visited[i][j]=False
            call_count += 1
            rv=bfs(i, j, 0)
            answer.append(rv)
            # print(rv)
            # max_visit.append(max(bfs(i,j,0)))



sorted_list=sorted(answer)
# print(*dangi_visited,sep="\n")
print(call_count)
print(*sorted_list,sep="\n")
