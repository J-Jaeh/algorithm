def solution(n):
    list_n =[]
    for a in range(1,11):
        list_n.append(fac(a))
    
    count =0
    for a in list_n:
        if a<=n:
            count+=1
    
    return count

def fac(n):
    if n>1:
        return n*fac(n-1)
    else:
        return 1
    