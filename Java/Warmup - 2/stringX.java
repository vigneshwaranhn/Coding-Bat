public String stringX(String str) {

    String temp = "";
  
  for(int i=0;i<str.length();i++) {
    
    if(!(i>0 && i<str.length() - 1 && str.charAt(i) == 'x')) 
    
    temp += str.charAt(i);
  
  }
  
  return temp;

}