import sys
def input():
    return sys.stdin.readline().rstrip()

def sol():
    N=int(input())

    input_list=list(map(int,input().split()))

    input_len=len(input_list)

    dp=[[False if i!=j else True for j in range(input_len)] for i in range(input_len)]

    # 두개일때 처리가 안된다!
    # 투포인터도 위에 방식은 짝수일때만.. 적용 가능해서 홀수일때도 적용가능하게 바꿔야함 ..
    for i in range(input_len):
        rp,lp=i,i
        while lp>=0 and rp<input_len:
            # print(f'{lp=} {rp=}')
            if input_list[rp]==input_list[lp]:
                dp[lp][rp] = True
            if input_list[rp]!=input_list[lp]:
                break
            rp += 1
            lp -= 1

        rp,lp=i+1,i
        while lp>=0 and rp<input_len:
            if input_list[rp]==input_list[lp]:
                dp[lp][rp] = True
            if input_list[rp]!=input_list[lp]:
                break
            rp+=1
            lp-=1

  
    # 두개일때 처리
    for i in range(input_len-1):
            if input_list[i]==input_list[i+1]:
                dp[i][i+1]=True

    # print(*dp,sep='\n')
    test_case=int(input())
    for _ in range(test_case):
        S,E = map(int,input().split())
        print(int(dp[S-1][E-1]))

if __name__=='__main__':
    sol()