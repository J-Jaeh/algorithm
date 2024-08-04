#기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.

## 분자 분모 각각 소인수 분해하고 dic너리화 할까 ?  set으로 만들면 중복을 처리 못하고
## list로 만들자니 빼기 힘들고
from collections import defaultdict

is_prime =[True]*1001
is_prime[0] = False
is_prime[1] = False
start_num =2
while(start_num*start_num <1001):
  if is_prime[start_num]:
    for x in range(start_num*start_num,1001,start_num):
        is_prime[x]=False
  start_num+=1

prime_list=[]
for i in range(0,1001):
    if is_prime[i]:
        prime_list.append(i)

def primeList(num)->list:
    plist=[]
    while num!=1:
        for p in prime_list:
            if (num%p)==0:
                plist.append(p)
                num//=p
                break
    return plist
def solution(a, b):
    if a%b ==0:
        return 1

    a_dic = defaultdict(int)
    b_dic = defaultdict(int)

    a_list = primeList(a)
    for a in a_list:
        a_dic[a]+=1

    b_list = primeList(b)
    for b in b_list:
        b_dic[b]+=1

    ## 일단 b에 있는걸 a가 가지고있다면 b꺼를 빼도 되자너 ?
    for b_key in b_dic.keys():
        if a_dic[b_key] >0:
            b_dic[b_key]-=1
    ## 이러면 b_dic에 키를 조사해봐서 2랑 5외의 다른게 있다면 .. 그건
    for b_key in b_dic.keys():
        if b_dic[b_key] >0:
            if b_key != 2 and b_key != 5:
                return 2
    return 1


if __name__ == "__main__":
    print(solution(11,22))
