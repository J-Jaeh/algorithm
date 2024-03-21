## 큐 구현하기

# 스택 구현
import sys

queue= [0] * 2000001
queue_pointer=0
insert_pointer=0

#push
def push(n):
    global insert_pointer
    queue[insert_pointer]=n
    insert_pointer += 1

#pop
def pop():
    global insert_pointer,queue_pointer
    if insert_pointer-queue_pointer<1:
        return -1
    pop=queue[queue_pointer]
    queue_pointer+=1
    return pop
#size
def size():
    global insert_pointer,queue_pointer
    return insert_pointer-queue_pointer
#empty
# 비어있으면 1 아니면 0
def empty():
    global insert_pointer,queue_pointer
    if insert_pointer-queue_pointer>0:
        return 0
    return 1
#top
def front():
    global insert_pointer,queue_pointer
    if insert_pointer-queue_pointer<1:
        return -1
    return queue[queue_pointer]
def back():
    global insert_pointer,queue_pointer
    if insert_pointer-queue_pointer<1:
        return -1
    back=queue[insert_pointer-1]
   # insert_pointer+=1
    return back
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
    elif stack_command[0] == 'front':
        print(front())
    elif stack_command[0] == 'back':
        print(back())
    elif stack_command[0] == 'empty':
        print(empty())