class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] g1 = {60,70,90};
    double[] g2 = {65,75,60};
    //Create a new student object 
    Student student1 = new Student("Tom",11,90, g1);

    Student student2 = new Student("Jerry",11,90,g2);

    print( student1.calculateAvg());
    print( student2.calculateAvg());
    
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}