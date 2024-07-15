import sys

def input():
    return sys.stdin.readline().rstrip()

def sol(arr:str)->int:
    answer=0
    temp=1
    for x in arr:
        if x == 'O':
            answer+=temp
            temp+=1
        else:
            temp=1

    return answer


if __name__ == '__main__':
    n = int(input())
    for _ in range(n):
        inputV=input()
        print(sol(inputV))
