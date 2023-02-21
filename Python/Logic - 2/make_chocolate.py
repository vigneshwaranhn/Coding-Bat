def make_chocolate(small, big, goal):
    
    big_req = goal//5
    
    if big_req >= big:
        
        goal -= big * 5
        
    else:
        
        goal -= big_req * 5
        
    if goal >= small:
        
        goal -= small
        
        if goal >0:
            
            return -1
        
        else:
            
            return small
        
    else:
        
        return goal
    
        goal = 0
        
    return -1