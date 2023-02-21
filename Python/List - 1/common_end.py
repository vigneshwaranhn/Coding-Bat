def common_end(a, b):
    
    if len(a) == len(b) == 1:
        
        return sum(a) == sum(b)
    
    if len(a) == 1 and len(b) != len(a):
        
        new_a = a[0]
        
        new_b =[b[0],b[-1]]
        
        return new_a in new_b
    
    if len(b) == 1 and len(a) != len(b):
        
        new_a =[a[0],a[-1]]
        
        new_b = b[0]
        
        return new_b in new_a
    
    if len(b) >= 2 and len(a) >= 2:
        
        new_a =[a[0],a[-1]]
    
        new_b =[b[0],b[-1]]
        
        return new_a[0] == new_b[0] or new_a[-1] == new_b[-1]