import sys


def input():
    return sys.stdin.readline().rstrip()



def sol(a:int, b:int)->tuple:
    num=b-45
    if num>=0 :
        return (a,num)

    new_num = 60+num
    if a ==0:
        return (23,new_num)
    return (a-1,new_num)



if __name__ == "__main__":
    a,b =map(int,input().split())
    print(*sol(a,b))