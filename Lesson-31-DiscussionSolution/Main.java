class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //Create a new student object 
    Student student1 = new Student("Tom",11,90);
    Student student2 = new Student("Jerry",12,65);

    print( student1.toStandardGpa() );
    print( student1.standardGpaLetterGrade() );
    
    print( student2.toStandardGpa() );
    print( student2.standardGpaLetterGrade() );
    
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}