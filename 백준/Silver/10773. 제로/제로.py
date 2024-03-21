# 제로
import sys
def input():
    return sys.stdin.readline().rstrip()


answer_list=[0]

N=int(input())

for _ in range(N):
    number = int(input())
    if number ==0:
        answer_list.pop()
    else:answer_list.append(number)


print(sum(answer_list))