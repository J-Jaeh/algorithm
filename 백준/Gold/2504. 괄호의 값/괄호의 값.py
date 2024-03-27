# 스택을 이용한 신기한 계산
import sys
def input():
    return sys.stdin.readline().rstrip()
str_list=list(input())
# print(str_list)
stack=[]
tem=1
answer=0
for i,x in enumerate(str_list):
    if x == '(':
        stack.append("(")
        tem*=2
    elif x== '[':
        stack.append("[")
        tem*=3
    elif x== ')':
        if not stack:
            print(0)
            break
        if stack[-1] !='(':
            print(0)
            break
        if str_list[i-1] == '(':
            answer +=tem
            tem=tem//2
            stack.pop()
        else:
            tem = tem // 2
            stack.pop()
    else:
        if not stack:
            print(0)
            break
        if stack[-1] != '[':
            print(0)
            break
        if str_list[i - 1] == '[':
            answer += tem
            tem = tem // 3
            stack.pop()
        else:
            tem = tem // 3
            stack.pop()
else:
    if stack:
        print(0)
    else:
        print(answer)