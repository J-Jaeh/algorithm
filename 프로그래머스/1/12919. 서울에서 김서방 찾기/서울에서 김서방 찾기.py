def solution(seoul):
    for i,s in enumerate(seoul):
        if s =="Kim":
            f ="김서방은 "
            l ="에 있다"
            return f+str(i)+l
    return -1