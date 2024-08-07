import sys


def input():
    return sys.stdin.readline().rstrip()


def sol_dp(n:int):

    return n * (n - 1) // 2



if __name__ == '__main__':
    print(sol_dp(int(input())))