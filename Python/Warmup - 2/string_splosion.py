def string_splosion(str):
    
    if len(str) == 1:
        
        return str
    
    string_splosion = ''
    
    for iteration in range(len(str)):
        
        string_splosion += str[:1+iteration]
        
    return string_splosion