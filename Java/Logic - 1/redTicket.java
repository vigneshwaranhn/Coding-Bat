public int redTicket(int a, int b, int c) {

    int result = 0;

    if(a == 2 && b == 2 && c == 2) {

        result = 10;

    }

    else if(a==b && b ==c) {

        result = 5;

    }  

    else if(b != a && c != a) {

        result = 1;

    }

    return result;

}