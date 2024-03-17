import sys
def hanoi(n:int,sta:int,aux:int,des:int):
    # 원판 두개로 생각했을때 !
    if n==1:
        # 첫 hanoi 인 경우 1 ->2 으로 가야하기 때문에 파라미터를 그에 맞게 설정,
        # 두번째 hanoi 인경우 2 ->3 으로 가야하기 때문에 파라미터를 그에 맞게 설정.
        print(str(sta) + " " + str(des))
        return
    hanoi(n-1,sta,des,aux)
    # return 다음에 실행되는 문장임 ! 
    # 1 -> 3 으로이동하는것 이건 22번째 hanoi 파라미터의 영향
    print(str(sta) +" "+ str(des))
    # 2 -> 3 으로 즉 34번째 문장에서 
    # 다시 리턴문 소환인데 ~ 2 -> 3으로 으로 가게 해줘야함 
    hanoi(n-1,aux,sta,des)




 
n=int(sys.stdin.readline().strip())

if n>20:
    print(2**n-1)
else:
    print(2**n-1)
    hanoi(n,1,2,3)