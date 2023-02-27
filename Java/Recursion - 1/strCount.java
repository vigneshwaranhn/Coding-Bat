public int strCount(String str, String sub) {

    if(str.length()<sub.length()) return 0;

    else {

        int len = sub.length();

        String first = str.substring(0,len);

        if(first.equals(sub)) {

            return 1 + strCount(str.substring(len),sub);
    
        }

        else {

            return strCount(str.substring(1),sub);

        }

    }

}