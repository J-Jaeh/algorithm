def solution(array):
    max_fre = 0
    max_fre_sec =0
    same_value =[]
    same_value_sec=[]
    for a in array:
        if max_fre < array.count(a):
            max_fre = array.count(a)
            same_value.append(a)
    reverse_array=array[::-1]
    for b in reverse_array:
        if max_fre_sec < array.count(b):
            max_fre_sec = array.count(b)
            same_value_sec.append(b)
    if same_value_sec[-1] != same_value[-1]:
        return -1
    else:
        return same_value[-1]