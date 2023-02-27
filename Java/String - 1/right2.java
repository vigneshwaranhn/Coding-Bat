public String right2(String str) {

    String lastTwo = str.substring(str.length() - 2);
  
    String firstStr = str.substring(0,str.length() - 2);
  
    return lastTwo + firstStr;
    
}