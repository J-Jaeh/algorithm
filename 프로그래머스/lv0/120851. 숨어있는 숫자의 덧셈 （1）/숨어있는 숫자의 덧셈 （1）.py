def solution(my_string):
    sum = 0
    for a in my_string:
        if a.isdigit():
            sum+= int(a) 
    return sum