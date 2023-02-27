public String withoutX2(String str) {

    if(str.isEmpty()) {
    
        return "";
  
    }

    else if(str.length()==1) {

        if(str.charAt(0)!='x') return (str.charAt(0) + "");

        else return "";

    }

    String firstTwo = str.substring(0,2);

    String rest = str.substring(2,str.length());

    if(firstTwo.charAt(1)!='x') rest = firstTwo.charAt(1) + rest;

    if(firstTwo.charAt(0)!='x') rest = firstTwo.charAt(0) + rest;

    return rest;

}