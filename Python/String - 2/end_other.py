def end_other(a, b):
    
    longer = a.lower()
    
    shorter = b.lower()
    
    if len(b) > len(a):
        
        longer = b.lower()
        
        shorter = a.lower()
        
    return longer[-len(shorter):]==shorter