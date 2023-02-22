public String[] fizzBuzz(int start, int end) {

    String[] result = new String[end - start];
    
    for(int i = 0; i < result.length; i++) {
    
        int temp = i + start;
    
        if(temp % 3 == 0 && temp % 5 == 0) {
    
            result[i] = "FizzBuzz";
        
        } 
        
        else if(temp % 3 == 0) {
        
            result[i] = "Fizz";
        
        } 
        
        else if(temp % 5 == 0) {
        
            result[i] = "Buzz";
        } 
        
        else  {
            
            result[i] = String.valueOf(temp);
        }
    
    }
    
    return result;
    
}