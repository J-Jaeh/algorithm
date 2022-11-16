def solution(id_pw, db):
    state = " "
    for same in db:
        if id_pw[0]==same[0] and id_pw[1]==same[1] :
            state = "login"
            return state
    for same in db:
        if id_pw[0]==same[0] and id_pw[1]!=same[1] :
            state = "wrong pw"
            return state
    for same in db:
        if id_pw[0]!=same[0] and id_pw[1]!=same[1] :
            state = "fail"
            return state
    