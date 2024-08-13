def solution(food):
    answer = ''
    for i, n in enumerate(food[1:],start=1):
        num=n//2
        if num>0:
            answer+=str(i)*num
        temp = answer
    answer+='0'
    answer+=temp[::-1]
            
    return answer