import sys

n = int(input())
a=[int(sys.stdin.readline()) for _ in range(n)]
left=0
right=n-1
last=right# ? 왜필요허더라 ..? 아마 교환의 마지막 시점을 구하려고 한건가 !

while left<right:
    for i in range(right,left,-1):
        if a[i-1]>a[i]:
            a[i],a[i-1]=a[i-1],a[i]
            last=i # 마지막으로 교환한시점이고.
    left=last # 마지막으로 교환한 시점을 left값에 넘겨준다 . 그말은 즉슨 다음 순회때는 지금 저장한 left까지만 순회

    for i in range(left,right,+1):
        if a[i]>a[i+1]:
            a[i],a[i+1]=a[i+1],a[i]
            last=i
    right=last # 마지막으로 교환한 시점을 right 넘겨준다 . 그말은 즉슨 다음 순회때는 지금 저장한 right까지 순회


[print(x) for x in a]