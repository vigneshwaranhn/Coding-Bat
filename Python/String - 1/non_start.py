def non_start(a, b):
    
    if len(a) == len(b) and len(a) == 1:
        
        return ''
    
    if len(a) > 1 and len(b) > 1:
    
        return a[1:len(a)] + b[1:len(b)]
  
    if len(a) == 1 and len(b) != 1:
  
        return b[1:len(b)]
  
    if len(b) == 1 and len(a) != 1:
  
        return a[1:len(a)]