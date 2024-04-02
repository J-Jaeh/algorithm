## 거스름돈
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n)->int:

    coin_list=[500,100,50,10,5,1]
    count=0
    for x in coin_list:
        count+=n//x
        n%=x
    return count

if __name__ == '__main__':
    print(sol(1000-int(input())))