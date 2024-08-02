import sys

def input():
    return  sys.stdin.readline().rstrip()


is_p=[True]*10001
is_p[0]=False
is_p[1]=False

s_p = 2
while(s_p * s_p <10001):
    if is_p[s_p]:
        for i in range(s_p * s_p,10001,s_p):
            is_p[i]=False
    s_p +=1


def sol(x:int)-> list:
    # x는 짝수인데 .. 이제 짝을 구해야겠쥬?
    rp = x//2
    lp = x//2
    while lp>0 and rp<x:
        if is_p[rp] and is_p[lp]:
           return [lp, rp]
        lp -=1
        rp +=1


if __name__ == '__main__':
    re = int(input())
    for _ in range(0,re):
        print(*sol(int(input())))