def solution(my_string):
    list_string = []
    solve =''
    for a in my_string.lower():
        list_string.append(a)
    
    for a in sorted(list_string):
        solve += a
        
    return solve