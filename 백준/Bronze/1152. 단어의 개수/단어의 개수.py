import sys


def input():
    return sys.stdin.readline().rstrip()

def sol(input:str)->int:
    if not input:
        return 0
    count =1
    for x in input:
        if x == ' ':
            count+=1
    return count

if __name__ == '__main__':
    input = input().strip()
    print(sol(input))