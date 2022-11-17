def solution(babbling):
    selected = []
    selected_2 = []
    selected_3 = []
    selected_4 = []
    count = 0

    for a in babbling:
        new = a.replace("aya","del")
        selected.append(new)

    for a in selected:
        new2 = a.replace("ye","del")
        selected_2.append(new2)

    for a in selected_2:
        new3 = a.replace("ma","del")
        selected_3.append(new3)

    for a in selected_3:
        new4 = a.replace("woo","del")
        selected_4.append(new4)

    for a in selected_4:
         if "del" == a or"deldel" == a or"deldeldel" == a or "deldeldeldel" == a:
            count +=1
    return count