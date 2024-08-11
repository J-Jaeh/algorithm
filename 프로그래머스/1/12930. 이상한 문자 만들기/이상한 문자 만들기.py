def solution(s:str):
    answer=''
    list_str = s.split(" ")
    for strs in list_str:
        for i,c in enumerate(strs,start=1):
            if i%2:
                c=c.upper()
            else:
                c=c.lower()
            answer+=c
        answer+=' '    
    
    return answer[:-1]