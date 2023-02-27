public int countAbc(String str) {

    if(str.length()<3) return 0;

    else {

        String first = str.substring(0,3);

        if(first.equals("abc") || first.equals("aba")) {

            return 1 + countAbc(str.substring(1));

        }

        else {

            return countAbc(str.substring(1));

        }

    }

}