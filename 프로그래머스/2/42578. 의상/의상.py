from collections import defaultdict

def solution(clothes:list)->int:
    dic=defaultdict(int)
    
    for _,cate in clothes:
        dic[cate] +=1
    answer = 1
    
    for count in dic.values():
        # +1의 의미는 해당 종류를 선택안햇을때
        answer*=(count+1)
    # -1 은 아무것도 선택안할때는 빼야하니까
    return answer-1

