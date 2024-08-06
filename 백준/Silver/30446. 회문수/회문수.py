import sys


def input():
    return sys.stdin.readline().rstrip()


def sol(num:int)->int:
    if num<10:
        return num
    count =9
    for length in range(2,len(str(num))+1):
        ## 이건 문자열 전체 길이고
        half_len = (length+1)//2

        ## max 절반에서의 값을정해야함
        if length == len(str(num)):
            max_half_value = int(str(num)[:half_len])
        else:
            max_half_value = 10**half_len-1

        ## min값은 어차피 고정임
        min_half_value = 10**(half_len-1)
        for v in range(min_half_value,max_half_value+1):
            ## 짝수 or 홀수
            if length%2 ==0:
                p_num = int(str(v) + str(v)[::-1])
            else:
                p_num = int(str(v) + str(v)[-2::-1])

            if p_num<=num:
                count+=1
    return count


if __name__ == '__main__':
    num=input()
    print(sol(int(num)))