def solution(strlist):
    new_strlist=[0]*len(strlist)
    count = 0
    for a in strlist:
        new_strlist[count]=len(a)
        count +=1
    return new_strlist