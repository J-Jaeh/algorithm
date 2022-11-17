def solution(array):
    max_value = array[0]
    count_index =0
    for a in array:
        if max_value < a:
            max_value =a
    
    for a in array:
        if max_value !=a:
            count_index +=1
        else:
            break
            
    result=[max_value,count_index]
    
    return result