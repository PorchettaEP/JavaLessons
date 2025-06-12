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

      //Update the room for student with an id STUDENT5 
      //10th period to 323 from 322.

      // First check that you are getting the correct records
    
      sql = "Select * from cr101 "  +
            "Where studentID = 'STUDENT5' and period = 10;";

      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);

      // Update the record 
      // NOTE: you need to pass just the sql string when updating
	    sql = "Update cr101 "  +
            "Set room = 322 "  +
            "Where studentID = 'STUDENT5' and period = 10;";

      db.runSQL(sql);

      // Check that the update took place
      sql = "Select * from cr101 "  +
            "Where studentID = 'STUDENT5' and period = 10;";

      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);

      //2-Remove the course PGF43Q2C from student with an id of STUDENT1270 schedule

      //Check to see that the where clause get the correct record
      sql = "Select * from cr101 " ;
      sql+=  "Where studentID = 'STUDENT1270' and course='PGF43Q2C' ";

      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);


      //delete the record
      sql  = " Delete From cr101 ";
      sql +=  "Where studentID = 'STUDENT1270' and course='PGF43Q2C' ";
    
      db.runSQL(sql);

      //check the record is no longer there
      sql = "Select * from cr101 " ;
      sql+=  "Where studentID = 'STUDENT1270' and course='PGF43Q2C' ";

      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);

	   
      
      }    
}