def array_front9(nums):
    
    if len(nums) < 4:
        
        if 9 in nums:
            
            return True
        
    first_4 = nums[:4]
    
    if 9 in first_4:
        
        return True
    
    else:
        
        return False