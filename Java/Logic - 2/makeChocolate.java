public int makeChocolate(int small, int big, int goal) {

    int x = Math.min(big,goal/5);

    goal -= 5*x;
  
    if(goal<=small) return goal;
    
    else return -1;
    
}