def combo_string(a, b):
    
    shorter = min(len(a),len(b))
    
    longer = max(len(a), len(b))
    
    if len(a) == shorter:
        
        return a + b + a
    
    else:
        
        return b + a + b