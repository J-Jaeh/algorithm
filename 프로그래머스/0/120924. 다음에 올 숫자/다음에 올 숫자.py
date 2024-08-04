def solution(common):
    # 일단 등비인지 등차인지 판단해야하는데
    # common의 길가 3이니 판단가능함
    f_v=common[0]
    s_v=common[1]
    t_v=common[2]

    if f_v - s_v == s_v - t_v:
        return common[-1] + (s_v - f_v)
    else:
        return common[-1]*(s_v//f_v)
