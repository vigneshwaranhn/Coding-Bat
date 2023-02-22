public String altPairs(String str) {

    String temp = "";

    for(int i=0;i<str.length();i+=4) {

        temp += str.charAt(i);

        if(i+1 < str.length()) {

            temp += str.charAt(i + 1);

        }

    }

    return temp;

}