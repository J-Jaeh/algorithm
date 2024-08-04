#https://school.programmers.co.kr/learn/courses/30/lessons/120913

def solution(my_str, n):
    count=0
    temp=''
    answer = []
    for c in my_str:
        if count ==n:
            answer.append(temp)
            temp=c
            count=1
        else:
            temp+=c
            count+=1
    answer.append(temp)

    return answer