public String frontBack(String str) {

    int len = str.length();
    
    if(len >= 2) {

        char first = str.charAt(0);

        char last =  str.charAt(len - 1);
        
        String middle = str.substring(1,len - 1);
    
        return last + middle + first;
    
    }

    else {

        return str;

    }
    
}