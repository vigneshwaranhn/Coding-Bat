public String frontTimes(String str, int n) {

    String temp = "";

    for(int i=0;i<n;i++) {

        if(str.length() >= 3)
      
        temp += str.substring(0,3);
        
        else
        
        temp += str;
    
    }
  
    return temp;

}