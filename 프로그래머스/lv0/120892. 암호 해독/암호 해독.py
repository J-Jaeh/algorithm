def solution(cipher, code):
    count =0
    solve = ""
    for a in cipher:
        count +=1
        if count%code ==0:
            solve += a
    return solve