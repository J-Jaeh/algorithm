# 일단정렬하고
import sys

# 5
# -2 4 -99 -1 98
# 입력값

n=int(input())

input_list=list(map(int,input().split()))

input_list.sort()

# print(answer)
low=0
high=len(input_list)-1
# 미드 값을 지정해 줄 필요가없음 .
# 음수의 한계값... 양수의 맥/
# 투포인터 .. 쓰자 !
answer=[]
# 투포인터는 어디까지 low가 하이와 같아 지면 종료해야하니까 같을때는 빼자
# 0에 가까운값을 ..찾기
min_number=sys.maxsize
while low<high:
    mid=input_list[low]+input_list[high]
    #0에 가까운 값이니까 절댓값 계산 을 해야한다 .
    if abs(min_number)>abs(mid):
        min_number=mid
        answer.clear()
        answer.append(input_list[low])
        answer.append(input_list[high])
        # mid 값이 0 보다 작다면 +값을 증가시켜줘야겠쥬 ?
    if mid<0:
        low+=1
    else:
        high-=1

print(*answer)


