class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        list_to_map={}
        ans=[]
        for i, n in enumerate(nums):
          list_to_map[n]=i

        for i in range(len(nums)):
            comple=target -nums[i]
            if comple in list_to_map and list_to_map[comple] != i:
                return [i,list_to_map[comple]]
