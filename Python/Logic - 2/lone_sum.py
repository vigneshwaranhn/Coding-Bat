def lone_sum(a, b, c):
    
    if a==b==c:
        
        return 0
    
    elif b==c:
        
        return a
    
    elif a==c:
        
        return b
    
    elif a==b:
        
        return c
    
    else:
        
        return a+b+c