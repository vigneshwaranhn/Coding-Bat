public String noX(String str) {

    if(str.length()==0) return "";
  
    else {

        char firstChar = str.charAt(0);

        str = str.substring(1);

        if(firstChar == 'x') {

            return "" + noX(str);
        
        }
    
        else {

            return firstChar + noX(str);
            
        }

    }
    
}