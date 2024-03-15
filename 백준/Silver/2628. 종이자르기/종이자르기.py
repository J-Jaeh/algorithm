def max_len(arr: list) -> int:
    arr.sort()
    max = 0
    pt = 0
    for i in range(1, len(arr)):
        if arr[i] - arr[pt] > max:
            max =arr[i] - arr[pt]
        pt += 1

    return max

x,y = map(int,input().split())
slice_count=int(input())
# 가로커팅 0, 점선번호
# 세로커팅 0, 점선번호

x_dot = [0,x]
y_dot = [0,y]

for i in range(slice_count):
    f,s=map(int,input().split())
    if f==0:
        y_dot.append(s)
    else:
        x_dot.append(s)

print(max_len(x_dot)*max_len(y_dot))