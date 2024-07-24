import sys


def input():
    return sys.stdin.readline().rstrip()



def sol(num:str , repeat:str)->str:
    answer=''
    for char in repeat:
        answer+=(char*int(num))
    return answer




if __name__ == '__main__':
    _x = int(input())
    for i in range(0,_x):
        num , repeat = map(str,input().split())
        print(sol(num,repeat))


