#병합정렬로 1개 까지 나눈ㄴ다음에
#병합하면됩
# 이때 필요한거는 본체함수, 머지함수, 대소비교함수
import sys


def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    #1 이 아니라면 나눠 ~
    mid =len(arr)//2
    left=merge_sort(arr[:mid])
    right=merge_sort(arr[mid:])
    left_=left
    right_=right
    return merge(left_,right_)


def merge(arr1:list,arr2:list)->list:
    r,l=0,0
    string_list=[]
    # 길이비교로 먼저 걸러야함

    while r<len(arr1) and l<len(arr2):
        if len(arr1[r]) > len(arr2[l]):
            if arr2[l] not in string_list:
                string_list.append(arr2[l])
            l += 1
        elif len(arr1[r]) < len(arr2[l]):
            if arr1[r] not in string_list:
                string_list.append(arr1[r])
            r += 1
        elif arr1[r]>arr2[l]:
            if arr2[l] not in string_list:
                string_list.append(arr2[l])
            l+=1
        else:
            if arr1[r] not in string_list:
                string_list.append(arr1[r])
            r+=1

    while r<len(arr1):
        if arr1[r] not in string_list:
            string_list.append(arr1[r])
        r+=1
    while l<len(arr2):
        if arr2[l] not in string_list:
            string_list.append(arr2[l])
        l+=1
    return string_list

n = int(sys.stdin.readline().strip())

sample_list=[sys.stdin.readline().strip() for _ in range(n)]

answer=merge_sort(sample_list)

for i in answer:
    print(i)




## 파이썬 사기다 !!!!!! 문자열 비교가 쌩을 로된다 !~
# def small_string(a:str,b:str)->str:
#     if(len(a)>len(b)): return b
#     elif(len(a)<len(b)):return a
#     #여기는 같은 문자열 길이가 같은 경우라서 하나 하나 비교해야함 .
#     # 파이썬은 문자열 비교가 바로가능하다




