import sys

def input():
    return sys.stdin.readline().rstrip()


def sol(a:int):
    for x in range(1,10):
        print(str(a) + ' * ' + str(x) + ' = ' + str(a*x))

if __name__ == '__main__':
    sol(int(input()))