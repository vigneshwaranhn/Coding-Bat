public boolean nestParen(String str) {

    if(str.length() == 0) return true;

    if(str.length() == 1) return false;

    else {

        char first = str.charAt(0);

        char last = str.charAt(str.length()-1);

        if(first=='(' && last == ')') {

            return nestParen(str.substring(1,str.length()-1));

        }

        else {

            return false;

        }

    }

}