public Map<String, Boolean> wordMultiple(String[] strings) {

    Map<String, Integer>counts = new HashMap<String, Integer>();

    Map<String, Boolean>results = new HashMap<String, Boolean>();
    
    for(int i = 0; i<strings.length;i++) {

        String key = strings[i];
        
        if(counts.containsKey(key)) {

            int val = counts.get(key);
     
            val++;
            
            counts.put(key,val);
        
        } else {

            counts.put(key,1);
        }

        results.put(key,counts.get(key) >= 2);
    }

    return results;

}