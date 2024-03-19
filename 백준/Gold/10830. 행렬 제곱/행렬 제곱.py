import sys


# n은 행렬 배열의 크기
# b는 거듭 제곱 해야하는 것
n,b=map(int,sys.stdin.readline().split())

## 행열 받기
arr=[list(map(int,sys.stdin.readline().split())) for _ in range(n)]
def exp(arr:list,b,n):
    if b==1:
        return divide(arr)
    else:
        temp_list=exp(arr,b//2,n)
        if b%2==0:
            #짝수일때 계산..
            return_list=multiple(temp_list,temp_list)
            return divide(return_list)
        else:
            # 홀수일때 계산 해줘야함.(원본*temp*temp)
            return_list=multiple(multiple(arr,temp_list),temp_list)
            return divide(return_list)

# 그냥 배열 계산해서 돌렺는 함수를 만드는게 빠를듯.
def multiple(arr1:list,arr2:list)->list:
    # 어차피 n*n배열이니까~
    temp_list=[]
    n=len(arr1)
    for i in range(n):
        temp_list.append([])
        for j in range(n):
            temp=0
            for k in range(len(arr1)):
                temp+=arr1[i][k] * arr2[k][j]
            temp_list[i].append(temp)
    return temp_list
def divide(arr:list)->list:
    for i in range(n):
        for j in range(n):
            arr[i][j] = arr[i][j] % 1000
    return arr

answer=exp(arr,b,n)

for i in range(n):
    print(*answer[i])