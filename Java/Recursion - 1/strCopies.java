public boolean strCopies(String str, String sub, int n) {

    if(sub.length()>str.length()) {

        if(n<=0) {

            return true;

        }

        else {

            return false;

        }

    }

    else {

        String first = str.substring(0, sub.length());

        if(first.equals(sub)) {

            return strCopies(str.substring(1),sub,n-1);

        }

        else {

            return strCopies(str.substring(1),sub,n);

        }

    }

}