# # 히오스
#
# 3 10
# 10
# 20
# 15
#
import sys

n,k =map(int,input().split())
input_list=[]

for _ in range(n):
    input_list.append(int(input()))
# k는 올릴 수 있는 레벨
# input_list에는 레벨이 담김 ..
# 이럴 때 얼마만큼 분배를 해줘야하나 ? 분배 ?
# 0~10

# 흠? 주어진 값보다 적게 줄수도있다는게 ...  참 ? 아이러니 하쥬 ~
# 흠?
# 일단 총합값을 만족하는 값을 찾아야하는건가 ?
# 그러면 레벨 총합을 다더한걸 레벨 총합이라고하고
# 그거에 k 값을 더한게 ~~~
# k 값이 다 사용 안될 수도 있으니까 가장 절절한 k 값을 찾는게 목표는 맞는데..
# 기본 올릴 수 있는 레벨이 1 "?
# 아 도도체 뭐지  가장 작은 레벨과 그다음 작은레벨이~ -> 그다음 작은 레벨로 맞춰주고
# 그다음  for 문의 탐색범위를 +1 해서 그다음 작은 레벨 까지 찾음
#  k= 10 - 5 = 5
# 그다음 작은 레벨은 5차이 인데 이걸 둘이 나눠 가지기 힘드니까 이때는 같은 레벨 수준 까지 올라온애들을 나눠가지기 하면 끝나는거일텐데 ?

input_list.sort()

def hos(arr,k):
    # min_level = sum(arr)
    # max_level = arr + k
    # # 이렇게 하면 범위를 정할 수 있고
    # 범위를 정해서 만들 수 있는 k 값을 구하는건가?
    # 만약에 중앙값을 만들 수 있냐 ? 부족하다 or 넘친다
    # 넘치면 더 올려야하고 부족하면 더 내려야하고
    #예상할때
    # low=1
    # high=k

    # while min_level<=max_level:
    #     mid=(min_level+max_level)//2
    #     tem_max=cal_max()
    return_value = 0
    search_index=1
    for i in range(len(arr)):
        #끝까지 갈경우...
        if i==(len(arr)-1):
            temp=k//search_index
            return arr[i]+temp

        if (arr[i+1]-arr[i])*(i+1)<=k:
           k-=(arr[i+1]-arr[i])*(i+1)
           search_index +=1
        else:
            temp=k//search_index
            return arr[i]+temp

print(hos(input_list,k))