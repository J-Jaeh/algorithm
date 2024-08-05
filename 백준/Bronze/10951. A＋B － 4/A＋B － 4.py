import sys

def input():
    return sys.stdin.readline().rstrip()

def sol(a,b):
    return a+b


if __name__ == "__main__":
    try:
        while True:
            line = input()
            if not line: 
                break
            a, b = map(int, line.split())
            print(sol(a, b))
    except EOFError:
        pass