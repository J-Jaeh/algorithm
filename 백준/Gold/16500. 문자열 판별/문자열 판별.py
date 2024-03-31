# A에있는 단어를 쪼개는게 아니라면
# 0/1 배낭넣기랑 비슷한건가 ??
# replace 돌리면 안되나 안됨~

import sys
def input():
    return sys.stdin.readline().rstrip()


def String_Identification(input_string:str)->int:
    N=int(input())
    verification=[input()  for _ in range(N)]
    dp=[0]*(len(input_string)+1)
    # 첫번째로 검증되는! 문자의 시작점 복사를 위해 필요
    dp[0]=1
    ## 글자길이 비교니까 적어도 한글자 이상일때부터니까 1부터시작하는건 합당
    for i in range(1,len(input_string)+1):
        for v in verification:
            ## 이렇게 하는이유 !
            ## dp[i] 값을 정할때 단순히 이전값에 의존하는 것이 아니라.. 해당위치까지 도달할 수 있는 모든 가능한 경로를
            #고려해야한다는것.. 따라서 길이비교와, 해당위치에 도달할수 있는지 고려
            if i>=len(v) and dp[i-len(v)]:
                if input_string[i-len(v):i] == v:
                    # dp[i]=1 로하려고하면 안되넹~
                    dp[i]=1
                    break
    # print(dp)

    if dp[len(input_string)] == 1:
        return 1
    else:
        return 0

if __name__ == '__main__':
    print(String_Identification(input()))