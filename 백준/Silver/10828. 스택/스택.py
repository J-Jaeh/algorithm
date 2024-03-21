# 스택 구현
import sys

stack=[0]*100001
stack_pointer=0

#push
def push(n):
    global stack_pointer
    stack_pointer+=1
    stack[stack_pointer]=n
#pop
def pop():
    global stack_pointer
    if stack_pointer<1:
        return -1
    pop=stack[stack_pointer]
    stack_pointer-=1
    return pop
#size
def size():
    global stack_pointer
    return stack_pointer
#empty
def empty():
    global stack_pointer
    if stack_pointer>0:
        return 0
    return 1
#top
def top():
    global stack_pointer
    if stack_pointer<1:
        return -1
    return stack[stack_pointer]
def input():
    return sys.stdin.readline().rstrip()

N=int(input())

for _ in range(N):
    stack_command = list(map(str,input().split()))
    if stack_command[0]=='push':
        push(stack_command[1])
    elif stack_command[0] == 'pop' :
        print(pop())
    elif stack_command[0] == 'size':
        print(size())
    elif stack_command[0] == 'top':
        print(top())
    elif stack_command[0] == 'empty':
        print(empty())