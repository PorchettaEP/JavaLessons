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
      // Review the database class, how it's instantiated 
    

      //Discuss the jar file 
      // Disucss that the database must be in one of our files in the project.

      String queryResult="";
      String sql = "";

     
		  Database   db =  new  Database("jdbc:sqlite:cr101.db" );	

      sql = " Select * From cr101 where "  ;
      sql+= " period = 3 and room = 106";

      queryResult = db.runSQL(sql,"table-auto");

      print(queryResult);
    
	   

    
      
      
	   
      
      }    
}