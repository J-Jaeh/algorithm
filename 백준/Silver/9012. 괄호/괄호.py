# 괄 호
import sys


def input():
    return sys.stdin.readline().rstrip()
N = int(input())

# (((((( 면 스택에 넣고 )))면 스택에서 빼고



for _ in range(N):
    input_list=list(input())
    stack = []

    for x in range(len(input_list)):
        if input_list[x] =="(":
            stack.append(input_list[x])

        else:
            if len(stack)==0:
                print('NO')
                break
            else:
                stack.pop()
        if x == len(input_list)-1:
           if len(stack)>0:
                print('NO')
           else:
                 print('YES')