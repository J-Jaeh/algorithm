def solution(polynomial: str) -> str:
    elements = polynomial.split(' + ')
    x_total = 0
    num_total = 0
    
    for e in elements:
        if 'x' in e:
            # 처리할 때, "x"가 단독으로 있는 경우도 고려
            if e == 'x':
                x_total += 1
            else:
                # "3x"와 같은 형태를 처리
                x_total += int(e[:-1])
        else:
            num_total += int(e)
    
    # 결과 조합
    result = []
    if x_total > 0:
        if x_total == 1:
            result.append("x")
        else:
            result.append(f"{x_total}x")
    
    if num_total > 0:
        result.append(str(num_total))
    
    return ' + '.join(result)

