from collections import defaultdict

def solution(s:str):
    dic = defaultdict(int)
    answer = []
    for i,c in enumerate(s):
         # print(dic.get(c))
         if dic.get(c):
            answer.append(i-dic.get(c)+1)
         else:
             answer.append(-1)
         dic[c]=i+1
    return answer