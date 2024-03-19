# 상근이는 나무 M미터가 필요하다. 근처에 나무를 구입할 곳이 모두 망해버렸기 때문에,
# 정부에 벌목 허가를 요청했다. 정부는 상근이네 집 근처의 나무 한 줄에 대한 벌목 허가를 내주었고,
# 상근이는 새로 구입한 목재절단기를 이용해서 나무를 구할것이다.
#
# 목재절단기는 다음과 같이 동작한다. 먼저, 상근이는 절단기에 높이 H를 지정해야 한다
# . 높이를 지정하면 톱날이 땅으로부터 H미터 위로 올라간다. 그 다음, 한 줄에 연속해있는 나무를 모두 절단해버린다.
# 따라서, 높이가 H보다 큰 나무는 H 위의 부분이 잘릴 것이고, 낮은 나무는 잘리지 않을 것이다
# . 예를 들어, 한 줄에 연속해있는 나무의 높이가 20, 15, 10, 17이라고 하자. 상근이가 높이를 15로 지정했다면
# , 나무를 자른 뒤의 높이는 15, 15, 10, 15가 될 것이고, 상근이는 길이가 5인 나무와 2인 나무를 들고 집에 갈 것이다.
# (총 7미터를 집에 들고 간다) 절단기에 설정할 수 있는 높이는 양의 정수 또는 0이다.
#
# 상근이는 환경에 매우 관심이 많기 때문에, 나무를 필요한 만큼만 집으로 가져가려고 한다.
# 이때, 적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 구하는 프로그램을 작성하시오.
import sys

# 그니까 ~ 첫번재는 나무 수와 필요한 나무의 길이

# 절단기 높이는 ?
# 절단기를 2분탐색하면 되겠넹 ?
# 근데 2분탐색하다가 ~ ? 하다가 ? 더 큰 자르는 값을 구할 수 도 있낭 ?
# ㅊ아닐 거같은뎅 흠..
a,b=map(int,sys.stdin.readline().split())

input_list=list(map(int,sys.stdin.readline().split()))

# def merge_sort(arr:list)->list:
#     if len(arr)==1:
#         return arr
#     else:
#         mid=len(arr)//2
#     return merge(merge_sort(arr[:mid]),merge_sort(arr[mid:]))
# def merge(left:list,right:list)->list:
#     l,r=0,0
#     return_list=[]
#     while r<len(right) and l<len(left):
#         if right[r] > left[l]:
#             return_list.append(left[l])
#             l+=1
#         else:
#             return_list.append(right[r])
#             r+=1
#     return_list+=left[l:]
#     return_list+=right[r:]
#     return return_list

def gain_saw(saw_list,tree_list,key)->int:
    # saw의 중간값으로
    # tree 잘라보고
    # 키값과 일치하는지 확인
    # 키값보다 크다면 => 더많이 자른거니까 saw를 더 높히고
    # 키값보다 작다면 => 덜자른 거니까 saw 값을 낮추면 된다
    row=0
    high=max_saw
    answer = 0
    while row<=high:
         mid =(row+high)//2
         saw=mid
         gain_tree=0
         for tree in tree_list:
             if tree>=saw:
                 gain_tree+=(tree-saw)
         if gain_tree==key:
             return saw
         elif gain_tree<key: # 적게 획득했다 ? 이거 문제있지
            high=mid-1
         else: # 더 많이 획득 했다 ? 그럼 톱을 올려서 좀 적게 획득하도록
            row=mid+1
            answer= saw
    # while 을 다 돌아도 딱맞는 높이를 못구하면 현재까지 구한 톱반한
    return answer

# sort_list=merge_sort(input_list)
max_saw=max(input_list)

saw_list=[]
# 가장 작은 트리의 크기는 구할 필요가 없다
# 왜나면 가장 작은 것보다 더 작은 톱으로 자를수도 있기 때문이다.
# for i in range(1,max_tree+1):
#     saw_list.append(i)

print(gain_saw(max_saw,input_list,b))



