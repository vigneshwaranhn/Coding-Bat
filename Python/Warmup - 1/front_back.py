def front_back(str):
    
    if len(str) < 2:
        
        return str
    
    else:
        
        front = str[0]
    
        back = str[-1]
        
        new_str = back + str[1:len(str)-1] + front
        
        return new_str