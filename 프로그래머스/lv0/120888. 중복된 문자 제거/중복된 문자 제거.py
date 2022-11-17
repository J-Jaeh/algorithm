def solution(my_string):
    del_string =''
    for a in my_string:
        if a not in del_string:
            del_string += a
    return del_string
