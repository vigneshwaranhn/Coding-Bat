public int strDist(String str, String sub) {

    if(str.length()<sub.length()) return 0;

    else if(str.length()==sub.length()) {

        if(str.equals(sub)) {

            return str.length();

        }

        else {

            return 0;

        }

    }

    else {

        int len = sub.length();

        String first = str.substring(0, len);

        String last = str.substring(str.length()-len);

        if(first.equals(sub) && last.equals(sub)) {

            return str.length();

        }

        else if(first.equals(sub) && !last.equals(sub)) {

            return strDist(str.substring(0, str.length()-1),sub);

        }

        else if(!first.equals(sub) && last.equals(sub)) {

            return strDist(str.substring(1), sub);

        }

        else {

            return strDist(str.substring(1, str.length()-1),sub);

        }

    }

}