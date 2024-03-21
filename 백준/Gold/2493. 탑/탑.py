#
# 시간 초과 날듯한데...

# 그냥 배열 만들어서 가장 마지막 인덱스 가리키고 그걸 옆으로 탐색하면 되는 거아닌가 ?
import sys


# 그냥 구현하는 거면 ... 의미가 있는 문제인가 근데 그렇다 쳐도 30 퍼센트는 뭔가 있다는것?!

# 아니 당연하게 시간초과 날건 뻔힌디 ...

## 헤드인덱스랑 라스트 인덱스 두개 가지고있는 포인터
## 근데 문제가있음 헤드인덱스를 pop으로 0 으로 고정 시키면 되는거아닌가 ?  어떻게 업데이트 시켜주지 ?
def input():
    return sys.stdin.readline().rstrip()


N = int(input())
top_list = list(map(int, input().split()))

stack = []
index_list = []

answer_list = []
answer_list.append(0)
# 가장 첫번째 탑을 넣고
stack.append(top_list[0])
index_list.append(0)
# 포인터가 필요한지 의문이다 이제..!
# pointer = 0

# peek  은 인덱스 [-1] 로 확인하자 ... ! 아..화난다
for i in range(1, N):
    # 더 크니까 pop 하고 바꿔줘야해
    if stack[-1] <= top_list[i]:
        stack.pop()
        index_list.pop()
        while stack:
            if stack[-1] > top_list[i]:
                stack.append(top_list[i])
                answer_list.append(index_list[-1] + 1)
                index_list.append(i)
                break
            else:
                stack.pop()
                index_list.pop()
        if len(stack) == 0:
            stack.append(top_list[i])
            answer_list.append(0)
            index_list.append(i)
    # 더작을때.
    else:
        stack.append(top_list[i])
        answer_list.append(index_list[-1] + 1)
        index_list.append(i)

print(*answer_list)
# test = []
# print(test)

## 난 아직도 부족한걸 느끼게 되는 답안 .. 뒤져버리겠다 완젼 ..
# top_list = list(map(int, input().split()))  # 탑 리스트
# stack = []
# answer = []
#
# for i in range(N):
#     while stack:
#         if stack[-1][1] > top_list[i]:  # 수신 가능한 상황
#             answer.append(stack[-1][0] + 1)
#             break
#         else:
#             stack.pop()
#     if not stack:  # 스택이 비면 레이저를 수신할 탑이 없다.
#         answer.append(0)
#     stack.append([i, top_list[i]])  # 인덱스, 값
#
# print(" ".join(map(str, answer)))
