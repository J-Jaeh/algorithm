###
import sys

sys.setrecursionlimit(10**9)

node_stack = []

def input():
    return sys.stdin.readline().rstrip()
input_list=[]
while True:
    try:
        input_list.append(int(input()))
    except:
        break



def post_order(start, end, pre_list):
    if start > end:
        return

    root = pre_list[start]  # 루트 값
    point = None

    # for 문으로 변환
    for i in range(start + 1, end + 1):
        if pre_list[i] > root:
            point = i
            break
    # point가 None이면, root보다 큰 값이 없는 것이므로, point를 end + 1로 설정
    if point is None:
        point = end + 1
    post_order(start + 1, point - 1, pre_list)  # 왼쪽 서브 트리 탐색
    # 오른쪽 트리 리턴이 끝나면 그제야 ~ 실행됨 . 아 맞네...
    post_order(point, end, pre_list)  # 오른쪽 서브 트리 탐색

    print(root)  # 루트 출력


post_order(0, len(input_list) - 1, input_list)