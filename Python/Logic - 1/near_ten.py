def near_ten(num):
    
    nums = [num-2, num-1,num, num+1, num+2]
    
    for n in nums:
        
        if n % 10 == 0:
            
            return True
        
    else:
        
        return False