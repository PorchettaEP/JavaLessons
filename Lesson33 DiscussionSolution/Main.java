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
    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};

    
    //Create a new student object 
    Student student1 = new Student("Tom",9,g1,courses1);

    Student student2 = new Student("Jerry",11,g2,courses2);

    /*
    1)Display any student’s name taking the course: FSFC3
    2)Display any student's name taking the course  HUF43X 
    and is a freshman.
    */
    if(student1.checkCourse("FSFC3")){
      print(student1.getFirstName());
    }
    
    if(student2.checkCourse("FSFC3")){
      print(student2.getFirstName());
    }
    //3) display if student is taking HUF43X and is in the 9th grade
    if(student1.checkCourse("HUF43X") && student1.gradeLevel == 9){
      print(student1.getFirstName());
    }

    if(student2.checkCourse("HUF43X") && student2.gradeLevel == 9){
      print(student2.getFirstName());
    }

    /*
    Display the average of the class (only two students in class)
    */
    double avg = (student1.calculateAvg() + 
                  student2.calculateAvg())  / 2;

    print("Avg of class: "+avg);
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}