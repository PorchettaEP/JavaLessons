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

     
		  Database   db =  new  Database("jdbc:sqlite:students.db");	

    //1
    sql = " Insert Into cr101 "  +
          " (course, section, period, teacher1, room,  studentid) " +
          " values ('MCLUB1', 3, 1, 'WHOKNOWS', 'ROOFTOP', 'STUDENT2') " ;

    db.runSQL(sql);
    
    //2
    sql = " Insert Into cr101 "  +
          " (studentid, course, section, teacher1, period, room) " +
          " values ('STUDENT4', 'CN100', 1, 'PORCHETTA', 2, 108) " ;

    db.runSQL(sql);

    
     
      
	   
      
      }    
}