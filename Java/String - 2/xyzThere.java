public boolean xyzThere(String str) {

    if(str.length()<3) return false;

    if(str.indexOf("xyz")==0) return true;

    for(int i = 1; i<= str.length()-3;i++) {

        String temp = str.substring(i,i+3);

        if(temp.equals("xyz") && str.charAt(i-1) !='.')

        return true;

    }

    return false;

}