def caught_speeding(speed, is_birthday):
    
    if is_birthday:
        
        if speed <= 65:
            
            return 0
        
        if speed <=85 and speed >= 66:
            
            return 1
        
        else:
            
            return 2
        
    else:
            
        if speed <= 60:
                
            return 0
            
        if speed <=80 and speed >= 61:
                
            return 1
            
        else:
                
            return 2