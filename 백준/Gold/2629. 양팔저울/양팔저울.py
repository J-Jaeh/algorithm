## 두가지를 생각
## 추로 온전히 구슬의 무게를 측정
## 아니면 구슬+추로 균형을 맞출건지 -> 부족하다면 이전에 측정한거에서 가능한지 확인
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol():
    N=int(input())
    weight_list=list(map(int,input().split()))
    ## 받은 리스트로 만들수 있는 dp 테이블 만들기
    ## 직관적인 2차원으로!
    weights=sum(weight_list)
    dp=[[0 for _ in range(weights+1)] for _ in range(N+1)]
    for i,item in enumerate(weight_list):
        for j in range(weights+1):
            ## 같을때 1
            if j==item:
                dp[i+1][j]=1
            # 이전 row에서 무게 - item 이 존재하면 15 -9 = 6 인데 이게 판별이 안되네
            elif j-item>0 and dp[i][j-item]:
                dp[i + 1][j] = 1
            ## 현재 추의 무게보다 더 적은 무게가 주어질 경우 ..
            elif j-item>0 and dp[i][j]:
                dp[i+1][j-item]=1
            ## 반대편에 놓았을대 이전 row 에서 부족한만큼 채워줄 무게가 존재할때
            elif j-item<0 and dp[i][item-j]:
                dp[i + 1][j] = 1
            ## 모두 해당 안된다면 위에서 가져오기
            else:
                dp[i+1][j]=dp[i][j]

    #print(*dp,sep='\n')
    K=int(input())
    test_case=list(map(int,input().split()))


    # ..! test case가 dp 배열보다 초과되는 경우 생각..... dp 배열을 딱맞게 만든 내가ㅏㅏ 멍충 ~
    for x in test_case:
       if x > weights:
        print('N',end=' ')
       else:
        print('Y', end=' ') if x == 0 or dp[N][x] == 1 else print('N', end=' ')
if __name__ == '__main__':
    sol()