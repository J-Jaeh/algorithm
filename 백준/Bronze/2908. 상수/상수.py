arr = list(map(str,input().split()))

v_1 =int(arr[0][::-1])
v_2 =int(arr[1][::-1])

big = v_1 if v_1>v_2 else v_2
print(big)