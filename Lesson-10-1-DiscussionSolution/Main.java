class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  

    /*
      Write a function sophomreCheck that takes in 
      Student's age and returns a string "Likely a sophemore" 
      if age is 15 otherwise return "Unknown"
    */
    int age =15;
    String result = sophomreCheck(age);
    System.out.println(result);


    /*
      Write a function weather that takes a temperature in
      degrees and returns a string "Warm to hot" if temperature
      is 70 degrees or more otherwise return "Cool to cold"
    */

    System.out.println( weather(40)) ;

    
    /*
      Write a function batteryStatus that takes in the battery
      percentage charge and returns a string "Need to recharge" 
      if the battery charge is below 10% otherwise it returns
      "Normal".
    */

    System.out.println(batteryStatus(0.45));
    System.out.println(batteryStatus(0.08));
    
  }

  String sophomreCheck(int age){
    
    if(age == 15)
      return "Likely a sophomore";
    else
      return "Unknown" ;   
  }

  String weather(double temp){
    
    if(temp >= 70)
      return "Warm to hot";
    else
      return "Cool to Warm";
  }
    String batteryStatus(double charge){
    
    if(charge < 0.1)
      return "Need to recharge";
    else
      return "Normal";
  }
  
}