from collections import deque

def solution(s):
    # 그럼 빈 칸이 나올때까지 저장했다가 빈칸 나오면 숫자로 변환 하든 뭘 하든 ok
    stack = deque()
    temp=''
    for c in s:
        if c != ' ':
            temp +=c
        else:
            stack.append(temp)
            temp=''
    stack.append(temp)

    answer = 0
    while stack:
        sp=stack.pop()
        if sp =='Z':
            stack.pop()
        else:
         answer+= int(sp)
    return answer