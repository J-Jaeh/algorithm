def solution(sides: list) -> int:
    max_v = max(sides)  # 2
    min_v = min(sides)  # 1
    # 걍 for 돌아
    count = 0
    #case 1 max 가 가장 긴변일때
    for n in range(1,max_v+1):
        if n+min_v>max_v:
            count+=1

    # case 2 구해야되는 값이 가장 긴변일때
    for n in range(max_v+1, max_v + min_v):
        count += 1


    return count