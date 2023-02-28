public String repeatEnd(String str, int n) {

    String lastn = str.substring(str.length()-n);

    String total = "";

    for(int i = 0;i<n;i++) {

        total += lastn;

    }

    return total;

}