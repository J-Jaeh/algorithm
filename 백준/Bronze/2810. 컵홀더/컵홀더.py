# 4이하일땐 바로 인풋 리턴
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n:int)->int:
    if n <5:
        return n

    strings=input()
    new_s=strings.replace('S',"")

    return n-(len(new_s)//2)+1

if __name__=='__main__':
    print(sol(int(input())))
