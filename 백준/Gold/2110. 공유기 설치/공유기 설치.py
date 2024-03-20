import sys

n,share=map(int,sys.stdin.readline().split())

input_list=[]
for _ in range(n):
    input_list.append(int(sys.stdin.readline().strip()))
# [input_list.append(int(sys.stdin.readline().strip())) for _ in range(n)]
input_list.sort()
#print(input_list)

def getDistance(sort_list:list,n):
    low=1
    # 거리의 최댓값이 잘못된건가 ?
    high=sort_list[-1]-sort_list[0]
    result=0
    while low<=high:
        middle_distance =(low+high)//2
        # 더 적게 획득함 거리 값을 줄여야함
        if getShared(middle_distance,sort_list)<n:
            # 거리를 중간값으로 줄였음 여기서 +를 해줄 필요가 있을까 ? 이미 중간값인데 ?
            # 사실 왜 +해주는건지 모르겠음 .. 인덱스라면 +해줘야 할거같은데 이건 인덱스가 아니니까
            high=middle_distance-1
            
        else:
            # 마찬가지로 왜 -해줘야하는지 모르겠어 이거는 gpt에게 찾아봐야할듯
            low=middle_distance+1
            result=middle_distance
    return result

def getShared(middle:int,sort_list:list)->int:
    # 중간길이값이 온다
    # 중간 길이값가지고 놓을 수 있는 공유기 갯수를 구해서 리턴시켜준다.
    # 이미 하나를 놓고 시작하니까 1 을 해줘야함 ..!
    count_shared=1
    check_location=sort_list[0]
    # 맞네 ~  1부터시작하니까 i 를 안늘려주니까 ...
    for i in range(1,len(sort_list)):
        # if(sort_list[i] >= middle+check_location)
        distance=sort_list[i]-check_location
        if distance>=middle:
            count_shared +=1
            check_location=sort_list[i]
    return count_shared

print(getDistance(input_list,share))

# print(getShared(4,[1,2,4,8,9]))


