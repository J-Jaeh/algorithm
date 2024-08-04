from collections import deque

# 모든 경우 탐색이니까 dfs..! 재귀를 이용해보자 근데 재귀 한계를 넘어가면 어떻게 하징 ..
def solution(numbers:list, target:int):

    return bfs(numbers,target)


def dfs(numbers:list, current:int,index:int,target:int)->int:
    # 종료 조건
    if index== len(numbers):
        # 만약 나온 결과물이 타겟과 동일하면 카운트 +1
        if current == target:
            return 1
        else:
            return 0

    # 재귀인데
    # +재귀
    sum_p = dfs(numbers,current+numbers[index],index+1,target)
    # - 재귀
    sum_m = dfs(numbers,current-numbers[index],index+1,target)

    return sum_p+sum_m


def bfs(numbers:list,target:int)->int:
    q = deque([(0,0)]) # (현재 합, 인덱스)
    count=0

    while q:
        sum,index=q.popleft()
        if index == len(numbers):
            if sum == target:
                count+=1
        else:
            q.append((sum+numbers[index],index+1))
            q.append((sum-numbers[index],index+1))
    return count
