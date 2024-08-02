import sys


def input():
    return sys.stdin.readline().rstrip()


def sol(x:int)->int:
    if x <100:
        return x
    count = 99
    for i in range(100, x+1):
        if i <1000:
            l = i//100
            m = (i-l*100)//10
            r = i-l*100-m*10
            if l-m == m-r:
                count +=1

    return count


if __name__=='__main__':
    print(sol(int(input())))
