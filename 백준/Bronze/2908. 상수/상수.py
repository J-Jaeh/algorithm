import sys


def input():
    return sys.stdin.readline().rstrip()


def sol(A:str,B:str)->int:
    return max(int(A[::-1]),int(B[::-1]))

if __name__ == '__main__':

    A,B = map(str,input().split())

    print(sol(A,B))


