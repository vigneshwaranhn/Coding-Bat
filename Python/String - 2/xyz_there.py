def xyz_there(str):
    
    if 'xyz' not in str:
        
        return False
    
    if str[:3] == 'xyz':
        
        return True
    
    for i in range(len(str)):
        
        if str[i]!='.' and str[i+1:i+4] =='xyz':
            
            return True
        
    return False