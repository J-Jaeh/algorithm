def solution(my_string):
    reverse=""
    for a in my_string:
        reverse = a + reverse
    return reverse