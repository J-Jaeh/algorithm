import sys

# 3
# 9
# 1 2 3 4 5 6 7 8 9
# 9
# 9 8 7 6 5 4 3 2 1
# 23
# 23 41 13 22 -3 24 -31 -11 -8 -7
# 3 5 103 211 -311 -45 -67 -73 -81 -99
# -33 24 56
import heapq

def input():
    return sys.stdin.readline().rstrip()


def sol(arr:list):
    answer=[]
    max_hq=[]
    min_hq=[]
    for i,num in enumerate(arr,start=1):
        heapq.heappush(max_hq,-num)

        #보정 비교
        if min_hq and -max_hq[0]>min_hq[0]:
            temp_min =heapq.heappop(min_hq)
            temp_max =-heapq.heappop(max_hq)
            heapq.heappush(min_hq,temp_max)
            heapq.heappush(max_hq,-temp_min)

        # 갯수 보정
        if len(max_hq)>len(min_hq)+1:
            heapq.heappush(min_hq,-heapq.heappop(max_hq))
        elif len(min_hq)>len(max_hq):
            heapq.heappush(max_hq,-heapq.heappop(min_hq))

        if i%2 ==1:
            answer.append(-max_hq[0])

    return answer


if __name__ == '__main__':
    tc = int(input())

    for _ in range(tc):
        arr_len = int(input())
        arr =[]
        while len(arr)<arr_len:
            temp = list(map(int,input().split()))
            arr+=temp

        print((arr_len+1)//2)
        answer:list = sol(arr)
        for i in range(0,len(answer),10):
            print(*answer[i:i+10])