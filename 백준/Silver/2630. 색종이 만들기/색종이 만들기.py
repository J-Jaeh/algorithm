# 색종이만들기
# z처럼 일단 좌표로 풀어,,>나눠 나눠 좌표 이동 할 필요가 이씅ㄹ 까 있나 있나보다 !
# 두가지 경우 1/4로 분할을때 모든 같은 숫자인지 판별  아 한가지 경우구나 어차피
# 왜나면 크기가 1까지 작아지면 결국 똑같이 만든 함수로 판별 가능
import sys

sys.setrecursionlimit(10**9)
n=int(input())

input_list=[list(map(int,input().split())) for _ in range(n)]

w,b=0,0
# print(input_list)

def quarter(n,x,y,arr):
    #재귀 들어왔을때 모두 동일한 숫자인지 판별하는 로직
    # 그게 아니라면 1/4해서 다시 각각 판별해야함
    global w,b
    answer_list=isSameNumber(arr,x,y,n)
    if answer_list[0]:
        if answer_list[1]==0:
            w+=1
        else:
            b+=1
        return

    ## 넘겨줄때 상대적인 위치를 지정해서 넘겨줘야한다 안그러면 ...!!! 바보가됨!
    mid=n//2
    ## 각 주어진 점은 시작 점인가 ? ₩~~~
    # 1
    quarter(mid,x,y,arr)
    # 2
    quarter(mid,x,y+mid,arr)
    # 3
    quarter(mid,x+mid,y,arr)
    # 4
    quarter(mid,x+mid,y+mid,arr)


def isSameNumber(arr:list,x,y,n)->list:
    #  1 은 가장 처음 에 1차원이라고 해서 넣어주면 판별가능
    # 내가 시작 인덱스를 너무 안일하게 생각 했구나 ㄱ ㅅㄱㅅㄱㅅ
    return_list=[]
    #시작하는 첫번재 값 ...
    initial_num =arr[x][y]
    for i in range(x,n+x):
        for j in range(y,n+y):
            if arr[i][j]!=initial_num: # 이러면 크기가 하나일때 비교가 되나 ? i문만 들어가겠죠 ~  j 안돌겠져
                return_list.append(False)
                return_list.append(initial_num)
                return return_list
    return_list.append(True)
    return_list.append(initial_num)
    return return_list



quarter(n,0,0,input_list)

print(w)
print(b)