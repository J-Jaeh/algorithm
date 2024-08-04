from collections import deque

# 연산자가 여러개 올경우도 생각해야함 
def solution(my_string:str)->int:
    s_m_s = my_string.split( )
    q = deque(s_m_s)
    answer =0
    while q:
        s=q.popleft()
        if s != "+" and s !="-":
            answer+=int(s)
        else:
            if s =="+":
                answer+=int(q.popleft())
            else:
                answer-=int(q.popleft())    

    return answer