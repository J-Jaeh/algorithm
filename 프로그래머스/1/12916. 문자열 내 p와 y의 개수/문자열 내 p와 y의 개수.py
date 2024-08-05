def solution(s:str):
    a = s.count('p')+s.count('P')
    b = s.count('y')+s.count('Y')
    return a==b