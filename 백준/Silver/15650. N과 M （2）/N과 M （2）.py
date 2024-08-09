import sys


# ##
# 재귀 함수 정의:
# 재귀 함수를 통해 현재 선택된 숫자의 리스트를 유지하면서, 아직 선택되지 않은 숫자들 중에서 새로운 숫자를 추가해 나갑니다.
# 기저 조건:
# 현재 선택된 숫자의 개수가 M에 도달하면, 그 숫자 리스트를 출력합니다.
# 가지치기:
# 각 단계에서 이전에 선택된 숫자보다 큰 숫자들만 다음 단계에서 선택하도록 하여 중복 조합을 방지합니다.
def input():
    return sys.stdin.readline().rstrip()



def sol(start:int,n:int,m:int,arr:list):
    # print(arr)
    if len(arr) == m:
        print(' '.join(map(str,arr)))
        return
    for s in range(start,n+1):
        # arr +[s] 는 새로운 리스트를 반환한다 sol 호출하고 pop이랑 동일한것 ..흠;; 후자는 계속 원본을 수정하는거넹
        sol(s+1,n,m,arr+[s])


if __name__ == '__main__':
    N,M = map(int,input().split())
    input_arr=[]
    sol(1,N,M,input_arr)