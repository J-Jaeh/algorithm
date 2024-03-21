import sys


# 핵심? 은 머리포인터가 꼬리포인터까지오면 다시 머리로 간다는건가
# start point 고정 꼬리 포인터 고정 ...
def input():
    return sys.stdin.readline().rstrip()


N, K = map(int, input().split())

yose_list = [False] * 1001

answer_list = []
count_K = 0
for i in range(1, N + 1):
    yose_list[i] = True

while len(answer_list) < N:
    for i in range(1, N + 1):
        if yose_list[i]:
            count_K += 1
        if count_K == K:
            yose_list[i] = False
            count_K = 0
            answer_list.append(i)

print("<", end='')
for i in answer_list[:N - 1]:
    print(i, end='')
    print(", ", end='')
print(answer_list[-1], end='')
print(">", end='')
