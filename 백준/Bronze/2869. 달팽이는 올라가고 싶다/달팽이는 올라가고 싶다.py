import sys


def input():
    return sys.stdin.readline().rstrip()


def sol(A: int, B: int, V: int) -> int:
    if A == V: return 1

    new_v = V - A

    # 내가 착각하고 있는거는 마지막날에 대한 처리가 정확하지 않았다는것... 그니가 첫날 은 생각해서 1더했는데 마지막날은
    # B만큼 빼줄 필요가 없다는 뜻..?

    day = (new_v+A-B -1) // (A - B)
    return day+1


if __name__ == "__main__":
    a, b, v = map(int, input().split())
    print(sol(a, b, v))
