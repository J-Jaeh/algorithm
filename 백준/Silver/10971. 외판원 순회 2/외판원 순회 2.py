n=int(input())
input_list = [list(map(int, input().split())) for _ in range(n)]

index_list=[]
row_cost=0
for i in input_list:
    row_cost+=sum(i)


def TSP(arr):
    global row_cost
    if len(arr)==n:
        if isPossible(arr):
            temp_cost=cal(arr)
            if temp_cost<row_cost:
                row_cost=temp_cost
    else:
        for i in range(n):
            if i not in index_list:
                index_list.append(i)
                TSP(index_list)
                index_list.pop()

## 4rodml 도시가 아님 ;;; 후.. 빡친다

def cal(arr:list)->int:
    cal_value=0
    for i in range(n-1):
        cal_value+=input_list[arr[i]][arr[i+1]]
    cal_value+=input_list[arr[n-1]][arr[0]]
    return cal_value

def isPossible(arr:list)->bool:
    if input_list[arr[n-1]][arr[0]] ==0:
        return False
    for i in range(n - 1):
        if 0== input_list[arr[i]][arr[i + 1]]:
            return False
    return True



TSP(index_list)

print(row_cost)