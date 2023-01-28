public String startOz(String str) {

    String tempStr ="";

    if(str.length()>= 1 && str.charAt(0) == 'o') {

        tempStr += 'o';

    }

    if(str.length()>= 2 && str.charAt(1) == 'z') {

        tempStr += 'z';

    }

    return tempStr;

}