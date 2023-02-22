public boolean dividesSelf(int n) {

    String temp = n + "";

    if(temp.contains("0")) {

        return false;

    }

    for(int i = 0; i < temp.length(); i++) {

        if(n % Integer.parseInt(temp.charAt(i)+"") != 0) {

            return false;

        }

    }

    return true;

}