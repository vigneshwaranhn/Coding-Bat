public String middleTwo(String str) {

    int len = str.length() / 2;
  
    return str.substring(len - 1,str.length() - (len - 1));
    
}