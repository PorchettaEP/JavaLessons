class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] g1 = {60,70,90};
    double[] g2 = {65,75,60};

    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};

    
    //Create a new student object 
    Student student1 = new Student("Tom",11,90, g1,courses1);

    Student student2 = new Student("Jerry",11,90,g2,courses2);

    
  }


  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}