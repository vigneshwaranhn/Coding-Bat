public Map<String, String> firstChar(String[] strings) {

    Map<String, String> map = new HashMap <String, String>();

    for(int i = 0; i< strings.length;i++) {

        if(map.containsKey(strings[i].substring(0,1))) {

            map.put(strings[i].substring(0,1),map.get(strings[i].substring(0,1)) + strings[i]);
        
        }
        
        else {

            map.put(strings[i].substring(0,1),strings[i]);
        
        }
    
    }
  
    return map;

}