# 트리가 뭔가
# 트리다! 자식이 있고 부모가 있고
# 뭘로 구현하냐 ?
# DFS BFS 는 뭐냐 ,,,>!
import sys


def input():
    return sys.stdin.readline().rstrip()


N = int(input())
tree = {}


def pre_order(root):
    if root != '.':
        print(root, end='')
        pre_order(tree[root][0])  # tree 라는 map 에서 key 값을 Root 로 찾아서 왼쪽 노드 반환
        pre_order(tree[root][1])  # tree 라는 map 에서 key 값을 Root 로 찾아서 오른쪽 노드 반환


def in_order(root):
    if root != '.':
        in_order(tree[root][0])
        print(root, end='')
        in_order(tree[root][1])


def post_order(root):
    if root != '.':
        post_order(tree[root][0])
        post_order(tree[root][1])
        print(root, end='')


for n in range(N):
    root, left, right = input().split()
    tree[root] = left, right  # map 자료구조 넣는건 이렇게 넣으면 되는구나~!

#print(*tree)

pre_order('A')  # 아 해당 노드부터 아래로 찾는거니까 A를 집어넣는거구나 ..
print()
in_order('A')
print()
post_order('A')
