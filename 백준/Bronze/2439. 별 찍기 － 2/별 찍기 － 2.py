import sys


def input():
    return sys.stdin.readline().rstrip()

def sol(n:int):
    for i in range(1,n+1):
        print(" "*(n-i)+"*"*i)


if __name__ =='__main__':
    num=int(input())
    sol(num)
