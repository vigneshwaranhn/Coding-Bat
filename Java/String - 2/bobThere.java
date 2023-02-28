public boolean bobThere(String str) {

    if(str.length()<3) return false;

    for(int i = 0;i<str.length()-2;i++) {

        String temp = str.substring(i,i+3);

        if(temp.charAt(0)=='b' && temp.charAt(2)=='b')

        return true;

    }

    return false;

}