def same_first_last(nums):
    
    if len(nums) == 0:
        
        return False
    
    else:
        
        return nums[0] == nums[len(nums)-1]