# 카드 2
import sys


# 최대 카드가 500,000까지 주어지니까 배열을 750,000까지만 생성해도 될듯한데 넉넉하게 두배하자

def input():
    return sys.stdin.readline().rstrip()

card_list=[0]*1000000


N=int(input())

input_index=N

head_index=1

for i  in range(1,N+1):
    card_list[i]=i


count=0
while head_index<input_index:
    #버린다는건 머리인덱스를 한칸 옆으로
    if count%2==0:
        head_index+=1
    else:
        # 그다음 횟수에는
        #head_index 에 존재하는 값을 input_index의 위치로 넣고
        card_list[input_index+1]=card_list[head_index]
        input_index+=1
        head_index += 1
    count+=1
print(card_list[head_index])