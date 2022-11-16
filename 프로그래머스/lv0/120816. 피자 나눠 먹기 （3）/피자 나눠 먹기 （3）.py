def solution(slice, n):
    pizza= n//slice +1
        
    if n%slice ==0:
       pizza -= 1
    return pizza