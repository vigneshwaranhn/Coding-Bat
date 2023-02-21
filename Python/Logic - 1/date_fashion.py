def date_fashion(you, date):
    
    couple = [you, date]
    
    for p in couple:
        
        if p <= 2:
            
            return 0
        
    for p in couple:
        
        if p >= 8:
            
            return 2
        
    else:
        
        return 1