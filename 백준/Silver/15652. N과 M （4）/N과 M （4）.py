import sys


def input():
    return sys.stdin.readline().rstrip()

## 조건은 같은 수를 여러번 골라도 된다.. 그리고 내림차순이면 안된다.. 비내림차순.
def sol(s,n,k,arr):
    if len(arr) ==k:
        print(' '.join(map(str,arr)))
        return

    for i in range(s,n+1):
        if len(arr)>0 and arr[-1] > i:
            continue
        sol(s,n,k,arr+[i])


if __name__ == '__main__':
    N,K = map(int,input().split())
    arr =[]
    sol(1,N,K,arr)

