def solution(num_list):
    a = [0] * (len(num_list ))
    count = 1
    for b in num_list:
       if count ==len(num_list)+1:
           break
       else:
        a[len(num_list) - count] = b
        count += 1

    return a