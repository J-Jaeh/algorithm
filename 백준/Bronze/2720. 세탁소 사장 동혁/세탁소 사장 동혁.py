## 동전 거스름돈 배수면 그리디의 해가 참이다
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n)->list:
    coin_list=[25,10,5,1]
    return_list=[]
    for x in coin_list:
        return_list.append(n//x)
        n%=x
    return  return_list


if __name__ == '__main__':
    test_case=int(input())
    for _ in range(test_case):
       print(*sol(int(input())))