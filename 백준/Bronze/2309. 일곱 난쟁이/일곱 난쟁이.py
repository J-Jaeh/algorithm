import sys

# 7이아닌 9   2명을 빼야함 일단 다 더하고 ? 시작해도 되지 않을까 ? 그리고 두개의 합이

input_list=[int(sys.stdin.readline().strip()) for _ in range(9)]

total_height=sum(input_list)

over_height=total_height-100

fake=[]
# 모든 경우 출력하라는거 아니니까 ... for문을 돌려봐 근데 비선형 구조가 아닌데 상관없나
for i in range(len(input_list)):
   remain_height=over_height-input_list[i]
   if remain_height in input_list and remain_height !=input_list[i] :
       fake.append(input_list[i])
       fake.append(remain_height)
       break

def merge_sort(arr:list)->list:
    if len(arr) ==1:
        return arr
    mid = len(arr)//2
    return merge(merge_sort(arr[:mid]),merge_sort(arr[mid:]))
def merge(left:list,right:list)->list:
    l,r=0,0
    merge_list=[]
    while l<len(left) and r<len(right):
        if left[l] > right[r]:
            merge_list.append(right[r])
            r+=1
        else:
            merge_list.append(left[l])
            l += 1
    merge_list+=left[l:]
    merge_list+=right[r:]

    return merge_list

answer_list=merge_sort(input_list)

for x in answer_list:
    if x not in fake:
        print(x)