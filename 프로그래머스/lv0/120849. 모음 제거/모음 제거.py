def solution(my_string):
    new_string=my_string
    for a in my_string:
        if a in "aeiou":
            new_string=new_string.replace(a,"")
            
    return new_string