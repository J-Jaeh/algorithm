# 동전 22
# 기본 아이디어는 동전이랑 유사
import sys


def input():
    return sys.stdin.readline().rstrip()

def program():
    coins, target = map(int, input().split())

    coin_list = [int(input()) for _ in range(coins)]
    set_coin_list = set(coin_list)

    coin_count = [1e9] * (target + 1)
    coin_count[0]=0
    
    for i, coin in enumerate(set_coin_list):
        for t in range(coin,target + 1):
            # print(coin)
            if t >= coin:
                coin_count[t] = min(coin_count[t - coin]+1,coin_count[t])
                # print(coin_count)
    print(coin_count[-1] if coin_count[-1] != 1e9 else -1)


if __name__ == "__main__":
    program()
