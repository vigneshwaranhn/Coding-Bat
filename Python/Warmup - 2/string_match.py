def string_match(a, b):
    
    count = 0
    
    shorter = min(len(a), len(b))
    
    for i in range (shorter-1):
        
        if a[i:i+2] == b[i:i+2]:
            
            count = count + 1
            
    return count