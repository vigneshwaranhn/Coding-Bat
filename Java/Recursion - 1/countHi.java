public int countHi(String str) {

    if(str.length()<=1) return 0;

    else {

        String firstTwo = str.substring(0,2);

        str = str.substring(1);

        if(firstTwo.equals("hi")) return 1 + countHi(str);

        else return 0 + countHi(str);

    }

}