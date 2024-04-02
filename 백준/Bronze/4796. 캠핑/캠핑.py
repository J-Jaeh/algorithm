## 캠핑
import sys
def input():
    return sys.stdin.readline().rstrip()
def sol(p,l,v)->int:
    return ((v//p)*l+(min((v%p),l)))

if __name__ =='__main__':
    test_count=1
    while True:
        l,p,v=map(int,input().split())
        if l==0 and p ==0 and v==0:
            exit()
        print(f'Case {test_count}: {sol(p,l,v)}')
        test_count+=1
