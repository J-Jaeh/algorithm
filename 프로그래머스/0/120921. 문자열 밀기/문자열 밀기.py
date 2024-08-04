from collections import deque

def solution(A:str, B:str):
    str_len =len(A)
    q=deque(list(A))
    count =0
    while str_len!=0:
        if ''.join(list(q))==B:
            return count
        q.appendleft(q.pop())
        str_len-=1
        count+=1
    return -1