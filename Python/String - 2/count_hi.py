def count_hi(str):
    
    count_hi = 0
    
    for i in range(len(str)-1):
        
        if str[i]=='h' and str[i+1] == 'i':
            
            count_hi += 1
            
    return count_hi