import sys


def input():
    return sys.stdin.readline().rstrip()


# 채만들기
is_prime=[True]*1001
## 0과 1은 소수가 아니다 !
is_prime[0]=False
is_prime[1]=False

start_prime=2
while(start_prime * start_prime<1001):
    if is_prime[start_prime]:
        for i in range(start_prime*start_prime,1001,start_prime):
            is_prime[i]=False
    start_prime+=1


def sol(arr:list)->int:
    count=0
    for x in arr:
        if is_prime[x]:
            count+=1
    return count

if __name__ == '__main__':
    _x=input()
    print(sol(list(map(int,input().split()))))
