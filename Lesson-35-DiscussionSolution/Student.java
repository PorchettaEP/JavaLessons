import java.util.ArrayList;

class Student{
  
  private String id;
  private int gradeLevel;
  private ArrayList<String> teachers;
  private ArrayList<String> courses;
  private double gpa;

  
  Student(String id, int gradeLevel, ArrayList<String> teachers, ArrayList<String> courses, double gpa){
    this.id          = id;
    this.gradeLevel  = gradeLevel;
    this.teachers    = teachers;
    this.courses     = courses;
    this.gpa         = gpa;
  }

  // Getters

  String getId(){return this.id;}
  int getGradeLevel(){return this.gradeLevel;}
  double getGpa(){return this.gpa;}
 

  // other class functions
  
  boolean findCourse(String course){
    for(int x=0; x<this.courses.size(); x++){
      if(courses.get(x).equalsIgnoreCase(course)){
        return true;
      }
    }
    return false;
  }
  
  
  boolean findCourseStartingWith(String course){
    for(int x=0; x<this.courses.size(); x++){
      if(courses.get(x).substring(0,course.length()).equalsIgnoreCase(course)){
        return true;
      }
    }
    return false;
  }
  
  
  boolean findTeacher(String teacher){
    for(int x=0; x<this.teachers.size(); x++){
      if(teachers.get(x).equalsIgnoreCase(teacher)){
        return true;
      }
    }
    return false;
  }
  
}