input = 20

# 소수 구하기 ... 입력값 아래의
# 도저희 못풀겠다 ... 해설영성 봤다 ㅠㅠ
#해설에서는.. 일단 내가 선택 한방법은 비효율적인방법임.
#추가로... 1과 ..그범위를 제한해서... 바로 나눠지면 브레이크 걸었음.. 좋은 생각인듯..
#이러면 카운트를 쓸필요가 없어지자나...
# 합성수를 거르고 소수만으로..구성해서...나눠 보면된다...
# 아... prime_list를 이용하면 되는구나...
#근데 ..아직도 아니야 왜 ?? N^2 이라서?
def find_prime_list_under_number(number):
    prime_list = []

    for a in range(2,number+1):
       for b in prime_list:
           if a%b == 0 and b * b <= a:
               #왜..? 소수의 필요 충분..조건임... 뭐 n의 제곱근까지만 나눠질수 있기때문에
               # n^2이하여야만해...
               break
       else:
        prime_list.append(a)




    return prime_list






result = find_prime_list_under_number(input)
print(result)
