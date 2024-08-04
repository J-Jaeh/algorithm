is_prime =[True]*10001
is_prime[0]=False
is_prime[1]=False
is_prime[10000]=False
start_num=2
prime_arr=[]
while(start_num*start_num<10000):
    for num in range(start_num*start_num,10000,start_num):
        is_prime[num]=False
    start_num+=1

for i ,b in enumerate(is_prime):
    if b:
        prime_arr.append(i)

def solution(n):
    answer = []
    # print(prime_arr)
    while n !=1:
        for prime in prime_arr:
            if n%prime==0: # 소수의 증거임
                n//=prime
                answer.append(prime)
                break

    return sorted(list(set(answer)))