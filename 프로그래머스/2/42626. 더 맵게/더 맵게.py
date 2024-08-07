import heapq

def solution(scoville:list, K)->int:
    heapq.heapify(scoville)
    count=0
    while True:
        if scoville[0]>=K:
            return count
        if len(scoville)==1:
            return -1
        one = heapq.heappop(scoville)
        two = heapq.heappop(scoville)
        new_s = one+two*2
        count +=1
        heapq.heappush(scoville,new_s)




