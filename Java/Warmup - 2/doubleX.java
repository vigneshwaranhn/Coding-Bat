boolean doubleX(String str) {

    int firstIndex = str.indexOf('x');
  
    if(firstIndex + 1 < str.length() && str.charAt(firstIndex + 1) == 'x')
    
    return true;
    
    else
    
    return false;

}