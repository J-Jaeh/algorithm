import sys

sys.setrecursionlimit(10**9)
a,b,c=map(int,sys.stdin.readline().split())

# -----답지참고합
## 지수의 성질을 이용한 분할정복과  모듈러 연산을 쓰라고함
# 감이안잡힌다 ?
###
def exponent(a,b,c):
    #짝수일때와 홀수일대까 다르다고했음 짝수와 홀수가 나뉘어져서 분할인가 ? 아니면 작게쪼갠다는 의미에서 분할인가 ?!
    # if 작수이면 if
    if b==1:
        return a%c
    else:
        temp_value=exponent(a,b//2,c)
        if b%2==0:
            return (temp_value*temp_value)%c
        else:
            return (a*temp_value * temp_value) % c


print(exponent(a,b,c))