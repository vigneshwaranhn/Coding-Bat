public String without2(String str) {

    if(str.length()<=1) {
    
        return str;
  
    }
  
    else if(str.length()==2) {
  
        return "";
  
    }
  
    else {
  
        if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
  
            return str.substring(2,str.length());
  
        }
  
        else {
  
            return str;
  
        }
  
    }

}