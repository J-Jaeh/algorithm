import sys

n, m=map(int,sys.stdin.readline().split())

input_list =list(map(int,input().split()))

select_index=[]

sum_card=0

expected_sum=0

# 3장까지 재귀돌고 뽑아 그값이 M보다 작고 현재 저장한 값보다 크면 현제 저장한 값을 업데이트
# 일단 끝까지 다 돌아야하니 까 항상 큰값을 업데이트 시켜줘야해 ~
def select(arr:list,sum_card):
    if len(arr)==3:
        global expected_sum
        if expected_sum<sum_card<=m:
            expected_sum=sum_card
    else:
        for j in range(n):
            if j not in arr:
                select_index.append(j)
                sum_card+=input_list[j]
                select(select_index,sum_card)
                sum_card-=input_list[select_index.pop()]

select(select_index,sum_card)


print(expected_sum)