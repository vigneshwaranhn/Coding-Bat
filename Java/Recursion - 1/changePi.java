public String changePi(String str) {

    if(str.length()<2) return str;

    else {

        String firstTwo = str.substring(0,2);

        if(firstTwo.equals("pi")) {

            return "3.14" + changePi(str.substring(2));

        }

        else {

            return str.charAt(0) + changePi(str.substring(1));

        }

    }

}