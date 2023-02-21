def no_teen_sum(a, b, c):
    
    a=fix_teen(a)
  
    b=fix_teen(b)
    
    c=fix_teen(c)
    
    return a+b+c

def fix_teen(n):
    
    if n==13 or n==14 or n==17 or n==18 or n==19:
        
        return 0
    
    else:
        
        return n