def solution(participant: list, completion: list):
    ## 한명을 찾아야하는데 일단 그렇담?
    ## 딕셔너리를 써볼까 ? 그냥 빼도 나올 듯하기도하고 ..?
    dic = {}
    for p in participant:
        if p not in dic:
            dic[p]=1
        else:
            dic[p]=dic.get(p)+1
    for c in completion:
        dic[c]=dic.get(c)-1
        
    answer =''
    for key in dic.keys():
        if dic[key] != 0:
            answer=key
            break

    return answer
