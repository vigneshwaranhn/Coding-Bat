public String parenBit(String str) {

    char first = str.charAt(0);

    char last = str.charAt(str.length()-1);

    if(first == '(' && last == ')') return str;

    else if(first == '(' && last != ')') return parenBit(str.substring(0, str.length() -1 ));

    else if(first != '(' && last == ')') return parenBit(str.substring(1));

    else {

        return parenBit(str.substring(1, str.length() -1 ));

    }

}