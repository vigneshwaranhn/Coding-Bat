public String stringBits(String str) {

    String temp ="";
  
    for(int i=0; i<str.length();i+=2) {
        
        temp += str.charAt(i);
    }
  
    return temp;

}