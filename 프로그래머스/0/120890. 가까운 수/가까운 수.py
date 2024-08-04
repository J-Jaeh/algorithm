def solution(array:list, n:int)->int:

    set_arr = set(array)

    if len(set_arr) ==1 :
        return array[0]
    sorted_set = sorted(set_arr)
    diff_V = abs(sorted_set[0]-n)
    for num_index in range(1,len(sorted_set)):
        if diff_V > abs(sorted_set[num_index]-n):
            diff_V=abs(sorted_set[num_index]-n)
        else:
            return sorted_set[num_index-1]

    return sorted_set[len(sorted_set)-1]

