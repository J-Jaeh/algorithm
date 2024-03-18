import sys

n = int(input())
numbers = list(map(int,input().split()))
operations_index=list(map(int,input().split()))
operation_list=[]

plus=operations_index[0]
minus=operations_index[1]
multiple=operations_index[2]
division=operations_index[3]

[operation_list.append("+") for _ in range(plus)]
[operation_list.append("-") for _ in range(minus)]
[operation_list.append("*") for _ in range(multiple)]
[operation_list.append("/") for _ in range(division)]


check_operation=[]
max=-sys.maxsize
min=sys.maxsize


# 어차피 arr에 check_operation 을 넣어줄꺼야 .
def oper(arr:list):
    global max,min,tem_value
    #재귀 종료 조건 // 인덱스로 오퍼레이터를 조절함.  n-1여야함 !
    if len(arr) ==n-1:
        #여기서 첫번째 계산을 끝내고 들어가면 다음부터 는 쉽겠쥬 ?₩
        tem_value = numbers[0]
        for o in range(len(arr)):
            tem=basic_operator(operation_list[arr[o]],tem_value,numbers[o+1])
            tem_value=tem
        if tem_value >max:
            max=tem_value
        if tem_value<min:
            min=tem_value
    else:# arr은 인덱스를 담는거라  n-1 을 하면 안되나 ? if 6일때 0-5 5개의 인덱스를 담음 근데 그게 무
        for i in range(n-1):
            if i not in arr:
                arr.append(i)
                oper(arr)
                arr.pop()
def basic_operator(opr:str,a:int,b:int)-> int:
    # + - * /
    if opr=="+":return a+b
    if opr=="-":return a-b
    if opr=="*":return a*b
    if opr=="/":
        if a<0:
            temp=a*(-1)
            return (temp//b)*(-1)
        return a//b


oper(check_operation)
print(max)
print(min)
