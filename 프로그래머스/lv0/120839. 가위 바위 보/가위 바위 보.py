def solution(rsp):
    answer = ""
    for a in rsp:
        if "2"==a:
            answer += "0"
        elif "0"==a:
            answer += "5"
        else:
            answer += "2"
            
    return answer