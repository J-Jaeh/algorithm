# 이분탐색의 기초다 !
# 구현해서 해보자
import sys

n = int(sys.stdin.readline().strip())
input_list = list(map(int,sys.stdin.readline().split()))
search_n =int(sys.stdin.readline().strip())
search_list=list(map(int,sys.stdin.readline().split()))

def merge_sort(arr:list)->list:
    if len(arr)==1:
        return arr
    mid=len(arr)//2
    return merge(merge_sort(arr[:mid]),merge_sort(arr[mid:]))
def merge(left:list,right:list)->list:
    l,r=0,0
    temp_list=[]
    while l<len(left) and r<len(right):
        if left[l] < right[r]:
            temp_list.append(left[l])
            l+=1
        else:
            temp_list.append(right[r])
            r += 1
    temp_list.extend(left[l:]) # 기존에는 append 한게 아니라 리스트 끼리 더해준거였음 .
    temp_list.extend(right[r:])
    return temp_list

def binary_search(arr:list,key:int)->int:
    row=0
    high=len(arr)-1

    while row<=high:
        mid = (row+high)// 2
        if key==arr[mid]:
            return 1
        # key가 더 크니까 row 값을 올려야함
        elif key>arr[mid]:
            row=mid+1
        else:
            high=mid-1

    return 0

sort_list=merge_sort(input_list)

for i in search_list:
    print(binary_search(sort_list,i))




