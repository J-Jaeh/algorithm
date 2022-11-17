def solution(numbers):
    numbers.sort()
    
    a,b=numbers[-1],numbers[-2]
    c,d=numbers[0],numbers[1]
    if a*b>c*d:
        return a*b
    else:
        return c*d
    