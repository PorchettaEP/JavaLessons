class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

    /*
      Problem 1:      
      Write a function that discount that takes an amount spent
      at the grocier and returns the rate 10% if the amount
      spent is over $100, otherwise it returns %0.

    */
    System.out.println( discounts(100.22));
   
    /*
      Problem 2:
      Write a function honors that takes a gpa and returns 
      a string "Honor Student" if gpa is 90 or above otherwise
      return "Work harder"
    */

    System.out.println( honors(100.22));
   
    /*
      Problem 3:
      Write a function shortSize that takes waste measurement
      in inches returns a string "Medium" if waste measurement
      is under 36 inches otherwise return "Large"
    */
    System.out.println( shortSize(100.22));

    
  }

  double discounts(double amt){
    if(amt>100)
      return 0.1;
    else
      return 0;
  }
  
  String honors(double gpa){
    if(gpa>=90)
      return "Honor Student";
    else
      return "Work harder";
  }
  
  
  String shortSize(double inches){
    if(inches<36)
      return "Medium";
    else
      return "Large";
  }
  
}