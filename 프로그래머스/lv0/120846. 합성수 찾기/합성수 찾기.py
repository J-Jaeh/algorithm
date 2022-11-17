def solution(n): 
    #합성수 구하기 
    
    count = 0
    answer =0
    for a in range(1,n+1):
        for b in range(1,a+1):
            if a%b==0:
                count +=1
        if count >=3:
            answer+=1
            count=0
    
    if answer !=0:
        return answer-1
    else:
        return 0