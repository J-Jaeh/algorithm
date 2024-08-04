from collections import defaultdict


# ["z", "d", "x"]	["def", "dww", "dzx", "loveaw"]	1

# dic 미리 셋팅하고 .key 없으면 바로 2반환 , 키 2개이상 빠지면 바로 2반환
def solution(spell, dic):
    for d in dic:
        dics = set_dic(spell)
        for c in d:
            if c not in dics:
               break;
            else:
                dics[c]=0
        answer =0
        for v in dics.values():
            answer+=v
        if answer ==0 :
            return 1
    return 2

def set_dic(spell:list):
    dic=defaultdict(int)
    for s in spell:
        dic[s]=1
    return dic
