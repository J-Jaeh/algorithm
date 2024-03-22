##
import sys


# 일단 받은 숫자를 문자로 받고 리스트로
def input():
    return sys.stdin.readline().rstrip()


N, K = map(int, input().split())

input_number_list = list(input())
answer_list = []
# 두가지 경우가 있을듯 .. for 다 돌았는데 pop 이 남은 경우 와 pop이 먼저 끝나버린경우
pop_count = 0
# stop_index=
for i in range(int(N)):
    while answer_list and pop_count < K:
        # 서로 pop 확인후 ..
        if answer_list[-1] >= input_number_list[i]:
            # 하면 바로 밑에서 추가 되겠쥬~
            break
        else:
            # 들어갈 값이 더 커서 문제인것.. 이때 언제까지 들어가냐가 문제..
            # 일단 빼고 pop 카운트 +1
            answer_list.pop()
            pop_count += 1
    answer_list.append(input_number_list[i])
    if pop_count == K:
        # # 남은 list에 다 더해줘~
        ## 여기서 더하면 for를 정지를 못시킨다 따라서 정지시킨 위치를 넘겨주는게 더 합리적일듯하다
        # 아 for 에서 체크하면 됨
        answer_list += input_number_list[i + 1:]
        break
# pop 카운트가 K개보다 적은데 ~
if pop_count < K:
    answer_list = answer_list[:N - K]

print(''.join(answer_list))
