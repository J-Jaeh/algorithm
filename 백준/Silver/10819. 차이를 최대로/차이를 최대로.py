n = int(input())
input_list=list(map(int,input().split()))

max_val=0
index_list=[]
def max_value(arr:list,n):
    global max_val
    if len(arr)==n:
        # 최댓값 계산함수 호출
        temp=swap_cal(arr,n)
        if temp>max_val:
            max_val=temp
    else:
        for i in range(n):
            if i not in index_list:
                index_list.append(i)
                max_value(index_list,n)
                index_list.pop()


# 인덱스 교환하면서 값을 계산해주는 함수
def swap_cal(arr:list,n)->int:
    max_val=0
    for i in range(len(arr)-1):
        max_val+=abs(input_list[arr[i]]-input_list[arr[i+1]])

    return max_val


max_value(index_list,n)

print(max_val)