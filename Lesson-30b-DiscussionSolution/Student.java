class Student{

  //Class varaibles- make private demo you
  // have no access
  private String firstName;
  private int gradeLevel;

  // Constructor is a special function that 
  // initialized the the class variables when an 
  // object is created.
  
  // The keyworkd "this" is used to refer to 
  // variables in this class.
  Student(String firstName, int gradeLevel){
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
  }

  // getters return the values of class variables
  // that are private and setters set values if
  // warrented.

  String getFirstName(){return this.firstName;}
  int getGradeLevel(){return this.gradeLevel;}

  // Grade level will change so we need a setter
  void setGradeLevel(int gradeLevel){
    this.gradeLevel = gradeLevel;
  }

  
  


  
}