###
import sys

sys.setrecursionlimit(10**9)
##
# top_root 값은 기억해.
# 작으면 왼쪽 top_root  크면 오른쪽,

# 그리고 기본으로 작은게 나올때까지 왼쪽으로 슈슈슈슈슉 스택 이용가능함 ? 가능할듯
node_stack = []
##
# s_t = {}
def input():
    return sys.stdin.readline().rstrip()
input_list=[]
while True:
    try:
        input_list.append(int(input()))
    except:
        break

# 시작은 전체배열 0,1, -1-> 업데이트해서 넣어줘야함
def postOrder(arr):
    if len(arr) == 0: # 배열이 비어 있다면 그대로 종료
        return
    if len(arr) == 1: # 배열에 값이 하나 있다면 값 출력한 후 종료
        print(arr[0])
        return

    idx = len(arr)# 일단 처음에는 끝값.
    # 루트노드 제외하고 루트노드보다 큰값을 찾아서 오른편업데이트
    for i in range(1, len(arr)):
        if arr[i] > arr[0]:
            idx = i
            break

    # 왼쪽 자식 노드에 대하여 재귀 호출
    if idx > 1:
        postOrder(arr[1:idx])

    # 오른쪽 자식 녿느에 대하여 재귀 호출
    if idx < len(arr):
        postOrder(arr[idx:])

    # 부모 노드의 값 출력
    print(arr[0])

postOrder(input_list)