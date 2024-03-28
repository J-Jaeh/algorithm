import sys

# s='000009'
# print(int(s))
# + - 를 기준으로 값을 리스트로 만들방법..!?re library ㄴㄴ !
def input():
    return sys.stdin.readline().rstrip()

input_list=input().split('-')

#print(input_list)
# 받아서 뭐함 ? 최솟값 어떻게 만들어 ~ .~ 가장 큰수 두개
# 조건 1 - 뒤에오면서 ... +인애 .. ! !

## - => + 해주기 .. 괄호는 한개가아님.
plus_list=[]
for x in input_list:
    # print("인풋",input_list)
    temp=0
    for z in x.split('+'):
        temp+=int(z)
    plus_list.append(temp)
# print(plus_list)

answer=plus_list[0]
for i,x in enumerate(plus_list):
    if i==0:
        continue
    answer-=x

print(answer)