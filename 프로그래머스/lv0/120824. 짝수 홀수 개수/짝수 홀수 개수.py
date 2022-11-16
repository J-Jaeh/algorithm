def solution(num_list):
    answer = [0]*2
    count_even = 0
    count_odd = 0
    
    for a in num_list:
        if a%2 ==0 :
            count_even +=1
        else:
            count_odd +=1
   
    answer[0]=count_even
    answer[1]=count_odd

    return answer