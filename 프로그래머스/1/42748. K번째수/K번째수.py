def solution(array:list, commands:list):

    answer = []
    for i , j , k in commands:
        new_arr=array[i-1:j]
        sorted_new_arr=sorted(new_arr)
        answer.append(sorted_new_arr[k-1])
    return answer