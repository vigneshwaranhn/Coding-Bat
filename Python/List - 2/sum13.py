def sum13(nums):
    
    total = 0
    
    i = 0
    
    while i < len(nums):
        
        if nums[i] != 13:
            
            total += nums[i]
            
            i+=1
            
        else:
            
            i+=2
            
    return total