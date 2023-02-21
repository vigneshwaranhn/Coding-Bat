def last2(str):
    
    if len(str) <= 2:
        
        return 0
    
    substring = str[-2:]
    
    count = 0
    
    for i in range(len(str) - 2):
        
        test = str[i:i+2]
        
        if test == substring:
            
            count += 1
            
    return count