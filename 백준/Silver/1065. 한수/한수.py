n=int(input())
hansu=0
if n<100:
    hansu=n
else:
    hansu=99
    for i in range(100,n+1):
        arr = list(str(i))
        if int(arr[0])-int(arr[1]) == int(arr[1])-int(arr[2]):
            hansu+=1
print(hansu)