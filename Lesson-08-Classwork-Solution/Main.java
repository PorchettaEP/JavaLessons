class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }


  void madlib(String noun, String adj, String verb){
    System.out.println("the "+ adj + " " + noun+" " + verb);
  }

  double areaOfSquare(double s){
    return s*s;
  }

  double areaOfCircle(double radius){
    return Math.PI*Math.pow(radius,2); 
  }
  
  void init(){
    // test your function
   
  }
}