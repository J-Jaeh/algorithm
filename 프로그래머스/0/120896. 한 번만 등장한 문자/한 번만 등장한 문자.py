from collections import defaultdict

def solution(s:str):
    dic = defaultdict(int)
    temp=[]
    for c in s:
        dic[c]=dic[c]+1
    for key in dic.keys():
        if dic[key] ==1:
            temp.append(key)
    temp.sort()

    answer = ''.join(temp)
    return answer

