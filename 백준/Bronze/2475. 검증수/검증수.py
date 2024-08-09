import sys


def input():
    return sys.stdin.readline().rstrip()


def sol(arr:list)->int:

    answer=0
    for a in arr:
        answer+=a*a%10

    return answer%10

if __name__ == '__main__':
    input_list = list(map(int,input().split()))
    print(sol(input_list))