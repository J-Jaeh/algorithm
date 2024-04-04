# 신나는 함수실행
# then? ?
# 시간초과
import sys
def input():
    return sys.stdin.readline().rstrip()

def w(a,b,c):
    # 있던 값이면 리턴 시키면 될거같은디? 3차원??
    # 이미 방문한거면 리턴?
    # 0보다 작아지는게 나오면 1리턴  방문은 아니고 해당하는 값을리턴해줘야하나봄??!
    if a<=0 or b<=0 or c<=0:
        return 1
    if a>20 or b>20 or c>20:
        return w(20,20,20)
    elif dp[c][b][a]==0:
        if a<b and b<c:
            dp[c][b][a]=w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c)
            return dp[c][b][a]
        dp[c][b][a]=(w(a-1,b,c)+w(a-1,b-1,c)+w(a-1,b,c-1)-w(a-1,b-1,c-1))
        return dp[c][b][a]
    else:
        return dp[c][b][a]

if __name__ =='__main__':
    dp = [[[0 for _ in range(51)] for _ in range(51)] for _ in range(51)]
    # print(w(1,1,1))
    while True:
        a,b,c=map(int,input().split())
        if a==-1 and b==-1 and c==-1:
            exit()
        else:
            i_a,i_b,i_c=a,b,c
            # if a > 20 or b > 20 or c > 20:i_a,i_b,i_c=20,20,20
            print(f'w({a}, {b}, {c}) = {w(i_a,i_b,i_c)}')


    # 인덱스 에러 1 1 21 에서남
    # while True:
    #     for a in range(-50,50):
    #       for b in range(-50,50):
    #         for c in range(-50,50):
    #             dp = [[[0 for _ in range(a + 1)] for _ in range(b + 1)] for _ in range(c + 1)]
    #             print(f'{a=},{b=},{c=}')
    #             w(a,b,c)











