#
import sys
def input():
    return sys.stdin.readline().rstrip()


N=int(input())


# stack 의 팝을 이용하는 문제 꺼내면서 큰값을 업데이트해줘야함 ..


input_list=[]
for _ in range(N):
    input_list.append(int(input()))

top = input_list[-1]
# 자기자신 하나 체크
# 아니 꺼내고 업데이트 하는 경우 를 생각 크기 비교하고 새로운 높이로 업데이트a
answer=1
for x in range(len(input_list)-1,0,-1):
    if x==0:
        if input_list[x]>top:
            answer+=1
            break
    if input_list[x-1]>top:
        answer+=1
        top=input_list[x-1]

print(answer)