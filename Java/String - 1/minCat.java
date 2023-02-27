public String minCat(String a, String b) {

    boolean aIsShorter = false;
  
    int diff = 0;
  
    if(a.length() < b.length()) {
    
        aIsShorter = true;
        
        diff = b.length() - a.length();
    
    }
    
    else {
        
        diff = a.length() - b.length();
    
    }
  
    if(aIsShorter) {
    
        return a + b.substring(diff);
    
    }
  
    else {
   
        return a.substring(diff) + b; 
  
    }
    
}