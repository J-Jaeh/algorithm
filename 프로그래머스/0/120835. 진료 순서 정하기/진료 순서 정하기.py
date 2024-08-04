import copy

def solution(emergency:list):
    temp_dic ={}
    temp_arr=copy.deepcopy(emergency)
    emergency.sort(reverse=True)
    for index,num in enumerate(emergency,start=1):
        temp_dic[num]=index

    answer = []
    for num in temp_arr:
        answer.append(temp_dic.get(num))
    return answer