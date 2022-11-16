def solution(price):
    pay_money = 0
    if price >=500000:
        pay_money = price*(1-0.2)
    elif price >=300000:
        pay_money = price*(1-0.1)
    elif price >=100000:
        pay_money = price*(1-0.05)
    else:
        pay_money = price
    
    answer = pay_money 
    return int( answer)