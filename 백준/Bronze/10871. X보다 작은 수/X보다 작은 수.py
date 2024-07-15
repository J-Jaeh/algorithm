import sys

def input():
    return  sys.stdin.readline().rstrip()


def sol(arr:list,a:int)->list:
   answer = [x for x in list if x<a]
   return answer

if __name__ == '__main__':
    N,X = map(int,input().split())
    list = list(map(int,input().split()))
    print(*sol(list,X))