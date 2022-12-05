import numpy as np

def solution(num_list, n):
    np_list = np.array(num_list)
    
    new_list = np_list.reshape(len(np_list)//n,n)
    
    return new_list.tolist()