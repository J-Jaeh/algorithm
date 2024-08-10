def solution(arr):
    if len(arr) ==1 : return [-1]
    min_v = min(arr)
    index_min = arr.index(min_v)
    
    return arr[:index_min]+arr[index_min+1:]