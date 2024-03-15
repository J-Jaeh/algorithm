import sys
import math
## < 소수구하기 개선하기>
# 개선 1 . n이 소수인지는 n보다 작은 소수들로만 판단해서 나누어 떨어지는지 판단하면된다
#          -> 소수라면 2부터 n-1까지 어떤 소수로도 나누어떨어지지 않는다



n =int(input())

arr = list(map(int,sys.stdin.readline().split()))

def is_prime_num(n):
    for i in range(2, int(math.sqrt(n))+1): # n의 제곱근을 정수화 시켜준 후 + 1
        if n % i == 0:
            return False

    return True
count=0

for a in arr:
    if is_prime_num(a)and a!=1:count+=1
print(count)


