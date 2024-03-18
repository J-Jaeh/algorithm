n =int(input())
input_list = list(map(int,input().split()))

# 머지소트로 정렬하고 0번인덱스 -1 번인덱스를 반환하자


def merge_sort(arr:list)->list:
    if len(arr)==1:
        return arr
    mid = len(arr)//2
    return merge(merge_sort(arr[:mid]),merge_sort(arr[mid:]))

def merge(left:list,right:list)->list:
    r,l=0,0
    merge_list=[]
    while r<len(right) and l<len(left):
        if left[l]<right[r]:
            merge_list.append(left[l])
            l+=1
        else:
            merge_list.append(right[r])
            r += 1
    merge_list+=left[l:]
    merge_list+=right[r:]
    return merge_list
answer_list=merge_sort(input_list)
print(str(answer_list[0])+" "+str(answer_list[-1]))