def make_bricks(small, big, goal):
    
    big_req = goal//5
    
    if big_req >= big:
        
        goal -= big * 5
        
    else:
        
        goal -= big_req * 5
        
    if goal >= small:
        
        goal -= small
        
    else:
        
        goal = 0
        
    return goal <= 0