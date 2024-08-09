import sys


def input():
    return sys.stdin.readline().rstrip()


def sol(arr:list)->str:
    ascending="12345678"
    descending="87654321"
    if ascending == ''.join(arr):
        return "ascending"
    if descending == ''.join(arr):
        return "descending"

    return "mixed"


if __name__ == "__main__":
    arr=list(map(str,input().split()))
    print(sol(arr))