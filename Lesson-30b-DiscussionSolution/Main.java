class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //Create a new student object 
    Student student1 = new Student("Tom",11);
    Student student2 = new Student("Jerry",12);

    // Since all variables are default public
    
    /*
    print( student1.firstName);
    print( student2.firstName);
    */
    
    //after hiding class variables by making
    //them private and we need:
    
    //getters to access the values
    // setters to change values if design warrents
    // as function in the class itself
    
    print(student1.getFirstName() );
    print(student2.getFirstName() );

    print(student1.getGradeLevel() );
    // change gradelevel for student1 to 12
    student1.setGradeLevel(12);
    print(student1.getGradeLevel() );

    
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}