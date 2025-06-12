class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }


  void init(){
    
  /*
    Problem 1: Translate the formula from eq1.png.  

    Don't forget to create the variable you need for the formula.
  */

    double A=0, x=0, z=0;

    z= Math.pow(A, 2*x+1);


    
  /*
    Problem 2: Translate the formula from eq2.png.  

    Don't forget to create the variable you need for the formula.
  */

    //Since we already declared x in the function init(), we don't 
    //have to declare it again.
    double y=0;
    y=2*x/(Math.sin(3*x));
    

    
    /*
    Problem 3: Translate the formula from eq3.png.  

    Don't forget to create the variable you need for the formula.
  */

    double b=0;
    b=Math.abs(x*x+1);

  }

  
}