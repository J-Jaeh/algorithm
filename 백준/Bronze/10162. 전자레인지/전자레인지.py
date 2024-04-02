# 동전남겨주기와 유사 300초 60초 10초 큰값이 최솟값의 배수라서 그리디의 해가 참
import sys
def input():
    return sys.stdin.readline().rstrip()

def sol(n)->list:
    time_list=[300,60,10]
    return_list=[]
    for x in time_list:
        return_list.append(n//x)
        n%=x

    if n==0:
        return return_list
    else:
        return [-1]

if __name__ == '__main__':
    print(*sol(int(input())))