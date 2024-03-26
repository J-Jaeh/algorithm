## 둘중 하나임 다른 물통을 가득 채우거나 아니면 완전히 비우거나
import sys

sys.setrecursionlimit(10**9)

def input():
    return sys.stdin.readline().rstrip()
A,B,C=map(int,input().split())

visit=[[0 for _ in range(B+1)] for _ in range(A+1)]
answer=[]
##수학적으로도 할수이싼?
# 8 9 10
# C 가 가득 차있다는 점과 A가 빌때의 C의 남은 양을 계산하려면 모든 경우의 수를 체크해야하지만
## 두가지 상황이 확정되면 나머지 겨웅도 확정되기 때문에 2차원배열로만들어 한번 판단한 경로는 판단하지 안도록


# a b 는 a의 물의양과 b의 물의양 고정이니까 단순하게 생각해서 관심이 는 물이동이라면  걍 a, b 박아도됨
## 넘친다면 b에서 a로 가는게 넘치는 거라면  a+b-A
def bfs(a,b):
    # 방문체크
    # print(f"{a=} {b= }")
    if visit[a][b]==0:
        visit[a][b]=-1
     # a가 0일때 배열에 담음 이때 리턴시켜야하나 ? ㄴㄴ 그럼 b c 이동이 안됨
        if a==0:
            answer.append(C-b)
        c=C-a-b
        #이동에서 생각해야할것은 다 넘겨주거나 다 채워서 남거나임
        # A->B
        if a+b<B:# 충분하게 넘겨줄수있는경우
            bfs(0,a+b)
        else: # B가 가득차고 a 가남는경우 if B 맥스가 10인데 이미 4가있음 근데 a는 7이야
            bfs(a+b-B,B)
        # A->C
        if a+c<C:
            #b의 양을 알아야하니까 이렇게 하면 안될듯...
            # 이건 맞는듯
            bfs(0,b)
        else:# C가 가득참? 그게 가능하나
            bfs(0,0)
        # B->C
        if b+c<C:
            bfs(a,0)#
        else:
            bfs(0,0) # b->C로 다 못 넘겨주는경우 == C가 다찬경우 아닙니까 ? 근데 그런 경우가 생길 수가
        # B->A
        if b+a<A:
            bfs(b+a,0)
        else:## A한테 다 넘겨주고 남은 b의 양은 >
            bfs(A,a+b-A)
        # C->A
        if c+a<A:
            bfs(c+a,b)
        else:
            bfs(A,b)
        # C->B
        if c+b<B:
            bfs(a,c+b)
        else:
            bfs(a,B)

# print(visit)
bfs(0,0)
answer.sort()
print(*answer)






