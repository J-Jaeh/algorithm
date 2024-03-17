import sys

# 체크의 개념으로 풀지만 일단 봐봐 n을받아야지 ?

n = int(sys.stdin.readline().strip())

# 마킹용 배열을 생성해서 해봐
# 인덱스 번호로 하는걸기억 ..... !
h=[True]*(n)
rl=[True]*(2*n-1) # / 방향 i+j
lr=[True]*(2*n-1) # \ 방향 n-1+i-j

global count
count=0
def set_i(i:int,n:int)->int:

    for j in range(n):
        if h[j] and rl[i+j] and lr[n-1-j+i]:
            if i==(n-1) :
                global count
                count+=1
            else: # i마킹이 끝난게 아니라면! 마킹하러 가세요
                h[j],rl[i+j],lr[n-1-j+i]=False,False,False
                set_i(i+1,n)
                h[j], rl[i + j], lr[n - 1 - j + i] = True, True,True

    return count

print(set_i(0,n))