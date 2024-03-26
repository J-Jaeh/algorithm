## 우선순위 큐라는 걸 알아버렸음 !
import heapq
import sys
def input():
    return sys.stdin.readline().rstrip()

N=int(input())

# 우선 순위 큐에 답아서 더하고 넣고 .? 반복 언제지 빌때 까지 ?
## 한개일경우 바로 값리턴 2개일 경우부터 넣고 돌리기
h=[int(input()) for _ in range(N)]
# h=[]
heapq.heapify(h)
# for i in range(N):
#     heapq.heappush(h,card_list[i])
# print(h)
# print(len(h))
answer=0
if N==1:
    print(0)
else:
    while len(h)>1:
        x1=heapq.heappop(h)
        x2=heapq.heappop(h)
        x3=x1+x2
        # print(f'{x1=} {x2=} {x3=}')
        answer+=x3
        heapq.heappush(h,x3)
    print(answer)









