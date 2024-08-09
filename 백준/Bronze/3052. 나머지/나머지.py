import sys
from collections import defaultdict

def input():
    return sys.stdin.readline().rstrip()


def sol(arr:list)->int:
    dic=defaultdict(int)
    for n in arr:
        dic[n]+=1

    return len(dic)



if __name__ == '__main__':
    arr=[]
    for _ in range(10):
        x=int(input())
        arr.append(x%42)
    print(sol(arr))