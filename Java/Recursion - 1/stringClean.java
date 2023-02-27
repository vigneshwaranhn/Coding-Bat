public String stringClean(String str) {

    if(str.length()<=1) return str;

    else {

        char first = str.charAt(0);

        char second = str.charAt(1);

        if(first==second) {

            return stringClean(str.substring(1));

        }

        else {

            return first + stringClean(str.substring(1));

        }

    }

}