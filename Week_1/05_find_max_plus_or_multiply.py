input = [0, 3, 5, 6, 1, 2, 4]


def find_max_plus_or_multiply(array):
    index_count=1
    sum_value = array[0]
    for a in array:
        if a*array[index_count] > (a + array[index_count]):
            sum_value = a*array[index_count]
            index_count +=1
            if index_count ==len(array):
                break
        else:
            sum_value =(a + array[index_count])
            index_count +=1
            if index_count ==len(array):
                break

    return sum_value


result = find_max_plus_or_multiply(input)
print(result)
