public int count11(String str) {

    if(str.length()<2) return 0;

    else {

        String first = str.substring(0,2);

        if(first.equals("11")) {

            return 1 + count11(str.substring(2));

        }

        else {

            return count11(str.substring(1));

        }

    }

}