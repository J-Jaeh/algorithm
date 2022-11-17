def solution(box, n):
    dice_num = int(box[2]//n) * int(box[1]//n) * int(box[0]//n) 
    
    return dice_num