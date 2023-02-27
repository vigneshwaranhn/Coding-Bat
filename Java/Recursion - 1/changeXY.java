public String changeXY(String str) {

    if(str.length()==0) return "";

    else {

        char firstChar = str.charAt(0);

        str = str.substring(1);

        if(firstChar == 'x') {

            return 'y' + changeXY(str);

        }

        else {

            return firstChar + changeXY(str);

        }

    }

}