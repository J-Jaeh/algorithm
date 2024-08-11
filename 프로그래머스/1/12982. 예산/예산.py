def solution(d, budget):
    d.sort()
    for i,n in enumerate(d):
        budget-=n
        if budget <0:
            return i
    
    return len(d)