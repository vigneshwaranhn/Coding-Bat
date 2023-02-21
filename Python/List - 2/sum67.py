def sum67(nums):
    
    total = 0
    
    omit = False
    
    for i in nums:
        
        if i == 6:
            
            omit = True
            
            continue
        
        elif i!=7 and omit:
            
            continue
        
        elif i == 7 and omit:
            
            omit = False
            
            continue
        
        else:
            
            total += i
            
    return total