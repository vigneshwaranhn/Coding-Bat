public String stringSplosion(String str) {

    String temp ="";
  
    for(int i=0; i<=str.length();i++) {
    
        temp += str.substring(0,i);
    
    }
    
    return temp;
    
}