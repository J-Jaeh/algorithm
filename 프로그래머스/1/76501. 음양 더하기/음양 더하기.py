def solution(absolutes, signs):
    answer=[]
    for a,s in zip(absolutes,signs):
        if s:
            answer.append(a)
        else:
            answer.append(a*(-1))
    return sum(answer)