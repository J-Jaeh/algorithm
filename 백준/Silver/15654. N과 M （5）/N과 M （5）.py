import sys


def input():
    return sys.stdin.readline().rstrip()

answer=[]
def sol(start:int,n:int,target:int,arr:list,temp_answer:list):
    # 종료조건
    if len(temp_answer) == target:
        answer.append(temp_answer)
        return
    # 그게 아니라면 이건 순서대로 증가하니까 가능했던 풀이자나 그럼 그게 아니라면 어떻게 해야할까
    # 겹치면 안되고 흠 ..!
    for i in range(n):
        if arr[i] in temp_answer:
            continue
        sol(i,n,target,arr,temp_answer+[arr[i]])

if __name__ == "__main__" :
    N,M = map(int,input().split())
    input_list = list(map(int,input().split()))
    sol(0,N,M,sorted(input_list),[])
    # print(answer)
    for a in answer:
        print(*a)
