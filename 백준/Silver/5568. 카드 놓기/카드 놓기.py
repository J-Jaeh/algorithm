def combin_card(combine_num:str,depth:int,card_list:list,answer_list:list,used_card:list):
    if depth == 0:
        if combine_num not in answer_list:
            answer_list.append(combine_num)
        return
    ## 인덱스를 사용해야하는 이유는 .. 동일 숫자카드에 대해서 depth분기가 2개면 괜찮은데 3개이상하면 다른 경우도 생기기 때문?
    for card_index in range(len(card_list)):
      if card_index not in used_card:
        # 파이썬은 스택이 없지만 list 로 스택 흉내를 낼수있다 push는 append pop은 pop
        used_card.append(card_index)
        # 글자 합치기
        # 아 클로져때문에 변수명을 구분...해야하는구나 개빡치네 ~
        new_combine_num=combine_num+card_list[card_index]
        depth-=1
        combin_card(new_combine_num,depth,card_list,answer_list,used_card)
        # return을 받고 다시 윗단계로 복구시켜줌.
        # 자바라면 안했을 거같은데 파이썬이라 필요한가 ?
        depth += 1
        used_card.pop()



card = int(input())
card_list=[""]*card
depth = int(input())

for i in range(card):
    card_list[i] = str(input());

answer_list=[]
used_card=[]
combin_card("",depth,card_list,answer_list,used_card)

print(len(answer_list))