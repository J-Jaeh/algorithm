import sys


def input():
    return sys.stdin.readline().rstrip()



## 1 호부터 채워짐 어디까지 ? if3 층까지 => 3명식 들어갈 수있음
#
def sol(H:int,W:int,N:int)->int:
    # f는 결국 층수가 되는게 뭐냐면 그치 나눈거니까 ~
    f = N%H
    if f ==0:
        f=H
    # 이제 호수를 정해야하는데 그러면 몇번 왕복이 중요하자나
    ho = (N - 1) // H + 1

    if ho<10:
        f*=10

    return int(str(f)+str(ho))


if __name__ == "__main__":
    tc = int(input())
    for _ in range(tc):
        h,w,n = map(int,input().split())
        print(sol(h,w,n))

# #N - 1)로 계산하는 이유:
# N번째 손님이 들어갈 방을 계산할 때, 호수는 손님이 H명씩 쌓여갈 때마다 하나씩 증가합니다.
# 예를 들어, H가 6일 때, N이 7이면 2호로 가야 합니다.
# 이걸 직관적으로 계산하기 위해 N - 1을 사용합니다. N - 1을 통해 손님이 0부터 시작하는 것처럼 계산하고, 이를 H로 나누면 각 호수에 몇 명이 배정되었는지를 정확히 알 수 있습니다.
# 이후 +1을 해주면, 이 손님이 배정될 호수를 알 수 있습니다.

## 그니까 H가 6일때 N이 6이면 2호로 가자나 그걸 방지하는거네 ?