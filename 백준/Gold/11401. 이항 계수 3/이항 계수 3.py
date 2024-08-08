import sys

big_prime=1000000007

def input():
    return sys.stdin.readline().rstrip()

def recur(n):
    # 모듈러 연산이용
    num = 1
    for i in range(1,n):
        num=num*(i+1)%big_prime
    return num

def pow_mod(n,e):
    if e == 0:
        return 1
    if e == 1:
        return n
    temp = pow_mod(n,e//2)


    if e % 2 ==0:
        return temp*temp%big_prime
    else:
        return temp*temp*n%big_prime


if __name__ == '__main__':
    N,K = map(int,input().split())
    print((recur(N)*pow_mod(recur(K)*recur(N-K),big_prime-2)%big_prime))
    # print(pow_mod(2,10))