import sys


def input():
    return sys.stdin.readline().rstrip()
def recur(m:int,arr:list,temp:list):
    #종료조건
    if len(temp)==m:
        print(*temp)
        return

    for i in range(len(arr)):
        if len(temp)>0 and temp[-1] > arr[i]:
            continue
        recur(m,arr,temp+[arr[i]])


if __name__ == "__main__":
    _,M=map(int,input().split())
    input_list =list(map(int,input().split()))
    recur(M,sorted(set(input_list)),[])
