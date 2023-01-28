public String everyNth(String str, int n) {

    String temp = str.substring(0,1);

    for (int i=n; i<str.length(); i += n) {

        temp += str.charAt(i);

    }

    return temp;

}