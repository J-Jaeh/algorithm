
n_arr=list(map(int,input().split()))
n=n_arr[0]
m=n_arr[1]
## 일단 배열을 받아야하니까..

input_list=[]
for _ in range(n):
    input_list.append(list(input()))

#print(input_list)
## 8*8 배열을 기준으로 가장 적은 값을 탐색하는거 찾기 ?


# 호출할때 x, y 는 8보다 작게...

## 아닌가......
##  값을 두개 정해서 둘중에 뭘 바꾸는게 더 효율적인지 판단을 해야함
answerlist=[]
#시작점정하기
for i in range(n-7):
    for j in range(m-7):
        countB = 0
        countW = 0
        for a in range(i,i+8):
            for b in range(j,j+8):
                if (a+b)%2==0:
                    if input_list[a][b] == 'B':
                         countB+=1
                    else:
                         countW += 1
                else:
                    if input_list[a][b] == 'W':
                         countB+=1
                    else:
                        countW+= 1

        answerlist.append(countB)
        answerlist.append(countW)


print(min(answerlist))