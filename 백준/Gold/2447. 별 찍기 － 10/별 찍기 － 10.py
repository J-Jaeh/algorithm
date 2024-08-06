# ***
# * *
# ***
import sys


def input():
    return  sys.stdin.readline().rstrip()


#재귀..
def sol(num:int)->list:

    if num == 3:
        return ["***","* *","***"]
    # n/3 크기의 패턴을 생성하기 위해 재귀적으로 호출
    stars = sol(num//3)

    re=[]
    for i in range(3):
        for s in stars:
            if i ==1:
                re.append(s+' '*(num//3)+s)
            else:
                re.append(s*3)
    return re


if __name__ == '__main__':
    input = int(input())

    arr = sol(input)
    for x in range(input):
        print(arr[x])
