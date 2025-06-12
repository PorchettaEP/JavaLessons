class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();
    int count=0;

    //1
    double sum=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      sum+=student.getGpa();
    }
    print("Students avg:  "+sum/students.length);


    //2
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findTeacher("Castro R")){
        count++;
      }
    }
    print("Castro R number of students "+count);

    //3
    count=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findCourse("SHF21U2C")){
        count++;
      }
    }
    print("Number of students taking SHF21U2C "+count);

    //4
    count=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findCourseStartingWith("MK") && student.findTeacher("Porchetta")){
        print("Id:"+ student.getId() );
        count++;
      }
    }
    print("Number of students taking course starting with MK with teacher Porchetta "+count);

    
    
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}