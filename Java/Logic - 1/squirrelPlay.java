public boolean squirrelPlay(int temp, boolean isSummer) {

    if(isSummer==true) {

        if(temp>=60&&temp<=100) {

            return true;

        }

    }

    else if(isSummer==false) {

        if(temp>=60&&temp<=90) {

            return true;

        }

    }

  return false;

}