def solution(dots):
    for a in dots:
        for b in a:
            if b < 0:
                b *= -1
    x_len=0
    y_len=0
    if dots[0][0] == dots[1][0]:
        x_len = dots[0][0]-dots[3][0]
    else:
        x_len = dots[0][0]-dots[1][0]
    
    if dots[0][1]==dots[1][1]:
        y_len = dots[0][1]-dots[3][1]
    else:
        y_len = dots[0][1]-dots[1][1]
    wide = x_len * y_len
    if wide< 0:
        wide *= -1
    return wide