# 전에 풀어봤던거
# 1.heapq 2.merge_sort 3. sort
import heapq
import sys
def input():
    return sys.stdin.readline().rstrip()

def hq(arr:list)->int:
    sum=0
    answer=0
    heapq.heapify(arr)
    while arr:
        sum+=heapq.heappop(arr)
        answer+=sum
    return answer

def m_s_sol(arr:list)->int:
    answer = 0
    sum = 0
    for x in arr:
        sum += x
        answer += sum
    return answer
def m_s(arr:list):
    if len(arr)<=1:
        return arr
    mid=len(arr)//2
    return merge(m_s(arr[:mid]),m_s(arr[mid:]))
def merge(l_a,r_a):
    l,r=0,0
    sorted_list=[]
    while l<len(l_a) and r<len(r_a):
        if l_a[l] < r_a[r]:
            sorted_list.append(l_a[l])
            l+=1
        else:
            sorted_list.append(r_a[r])
            r+=1
    sorted_list.extend(l_a[l:])
    sorted_list.extend(r_a[r:])
    return  sorted_list

def s(arr:list)->int:
    arr.sort()
    answer=0
    sum=0
    for x in arr:
        sum+=x
        answer+=sum
    return answer

if __name__ =='__main__':
    N=int(input())
    input_list=list(map(int,input().split()))
    # print(hq(input_list))
    # print(s(input_list))
    print(m_s_sol(m_s(input_list)))
