# [[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]	[4, 4, 6, 2, 2, 1, 7]


def solution(score:list):
    sum_list=[]
    index=0
    for a,b in score:
        sum_list.append((index,a+b))
        index+=1

    #합을 기준으로 정렬된 리스트 자나
    sorted_list = sorted(sum_list,key=lambda  x : x[1],reverse=True)
    ##이거 우선순위 큐로 뽑는게 더 이득이였을라나 .. ? 그랬을듯 .. ..
    rank=1
    rank_list=[]
    w_v =0  # 가중치
    pre_V =-1 # 이전값
    for index, sum_v in sorted_list:
        if pre_V ==sum_v:
            w_v +=1
            rank_list.append((rank-w_v,index))
            rank += 1
        else:
            rank_list.append((rank,index))
            rank+=1
            w_v=0
        pre_V=sum_v
    #인덱스를 기준으로 정렬
    sorted_rank =sorted(rank_list,key=lambda x:x[1])

    answer=[]
    for x,i in sorted_rank:
        answer.append(x)

    return answer


if __name__ == '__main__':
    print(solution([[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]))