import sys

def input():
    return sys.stdin.readline().rstrip()

def sol(a,b):
    return a+b


if __name__ == "__main__":
    try:
        while True:
            a, b = map(int, input().split())
            if a == 0 and b ==0:
                break
            print(sol(a, b))
    except EOFError:
        pass