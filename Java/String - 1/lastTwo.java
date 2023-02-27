public String lastTwo(String str) {

    int len = str.length();
  
    if (len >= 2) {
  
        String part = str.substring(0, len - 2);
        
        return part + str.charAt(len - 1) + str.charAt(len - 2);
  
    }
  
    else {
  
        return str;
  
    }

}