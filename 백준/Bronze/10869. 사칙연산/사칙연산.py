#두 자연수 A와 B가 주어진다.
#이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

a, b = map(int, input().split())
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)


## 알게된것##
# 파이썬 input 값을 공백을 기준으로 받을때 map(int,int().split()) 이용하자
# 파이썬 의 몫 은 // 로구한다
# 나머지는 자바와 유사한 %

