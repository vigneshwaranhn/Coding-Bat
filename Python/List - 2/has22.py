def has22(nums):
    
    total = 0
    
    for i in range(len(nums)-1):
        
        if nums[i] == 2 and nums[i+1] == 2:
            
            return True
        
    return False