import sys


def input():
    return sys.stdin.readline().rstrip()

def sol(s:str,n:int)->str:
    return s[n-1]


if __name__ =='__main__':
    string=input()
    num=int(input())
    print(sol(string,num))
