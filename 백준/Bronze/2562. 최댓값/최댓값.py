max=0
index=0
for a in range(9):
    b=int(input())
    if b>max:
        max=b
        index=a
print(max)
print(index+1)