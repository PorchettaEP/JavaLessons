import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

      String queryResult="";
      String sql = "";
     
		  Database   db =  new  Database("jdbc:sqlite:cr101.db" );	

      // #1
      //Add the course SLF43 with a section 5, period 5 in room 341 
      //and teacher1 is WILLIAMS  for student with an ID of STUDENT1000 
      //who is in grade 10 and has an official class 2Y0.

    
      sql = "Insert into cr101 "   +
        "(StudentId, Offclass, Grade, Course, Section, Teacher1, Teacher2, Period, Room) "+
        " Values ('STUDENT1000','2Y0',10,'SLF43',5,'WILLIAMS','',5,341 ) ";


      db.runSQL(sql);


      // Check that the update took place
      sql = "Select * from cr101 "  +
            " Where studentID = 'STUDENT1000' ";

      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);
      
      }    
}