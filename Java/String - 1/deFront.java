public String deFront(String str) {

    String back = str.substring(2, str.length());
    
    if(str.charAt(1)=='b') back = 'b' + back;
    
    if(str.charAt(0)=='a') back = 'a' + back;
    
    return back;
    
}