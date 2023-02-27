public String lastChars(String a, String b) {

    String aString = (a.length() >= 1) ? a.substring(0,1) : "@";
  
    String bString = (b.length() >= 1) ? b.substring(b.length() - 1) : "@";
  
    return aString + bString;
    
}