def solution(numbers, direction):
    new_numbers=[0]*len(numbers)
    count=0
    for a in numbers: 
        try:      
            if direction == "right":
                new_numbers[count+1]=a
                count+=1
            else:
                new_numbers[count-1]=a
                count+=1
        except:
            new_numbers[0]=a
            
           
    return new_numbers