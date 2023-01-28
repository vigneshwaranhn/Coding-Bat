public String front3(String str) {

    if(str.length() >= 3) {

        String temp = str.substring(0,3);

        return temp + temp + temp;

    }

    else {

        return str + str + str;

    }
    
}