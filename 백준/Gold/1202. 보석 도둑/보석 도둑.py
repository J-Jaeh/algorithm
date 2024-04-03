### ## # # #
# 그중 가장 가치 있는 보석 담기, 추가로 큐는 계속 유지
import heapq
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol():
    # N 은 보석수 K 는 배낭수
    N,K =map(int,input().split())
    j_list=[]
    b_list=[]

    for _ in range(N):
        m,v=map(int,input().split())
        j_list.append((m,v))
    j_list.sort(key=lambda x:x[0])
    # print(j_list)
    for _ in range(K):
        m=int(input())
        b_list.append(m)
    b_list.sort()
    # print(b_list)
    ## 가방무게보다 커지기 전까지 넣기 .check
    ## 대신 가치가 가장 높게 나오도록 설정하기
    q=[]
    sum=0
    # 보석 큐에 한번 들어갔으면 더 안들어가게
    # check=[True]*(N) .. 시간초과 좀더 절약해야함
    stop_point=0
    for x in b_list:
        for i in range(stop_point,len(j_list)):
            m=j_list[i][0]
            v=j_list[i][1]
            # print(f'{m=} {v=} {i=} {x=}')
            if x>=m:
                # print(check)
                heapq.heappush(q,v*(-1))
            else:
                stop_point=i
                break
        else:
            stop_point=len(j_list)
        # 가방 x 에대해서 다돌았으면 이제
        # print(q)
        if q:
            # 가방은 4개인데 왜 3개밖에 안더해지냐 !
            sum+=(heapq.heappop(q))*(-1)
    return sum


if __name__ =='__main__':
    print(sol())
