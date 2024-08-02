def solution(nums:list):
    lens = len(nums)//2
    set_len = len(list(set(nums)))
    return min(lens,set_len)