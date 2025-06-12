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

    String result="";
    String sql = "";
     
		Database db = new Database("jdbc:sqlite:chinook.db" );	

    //1
    //List all the album title's and the artist name who produced the album.

    sql  = " Select albums.title, artists.name from albums ";
    sql += " Inner Join artists ";
    sql += " On albums.artistid = artists.artistid " ;
    sql += " Limit 20 ";
    result = db.runSQL(sql,"table-auto");
    print(result);
    

    //2
    //List all the song(tracks) names that are genre of: Blues, Latin, Pop, Classical.

    sql  = " Select tracks.name from tracks ";
    sql += " Inner Join genres ";
    sql += " On tracks.genreId = genres.genreId ";
    sql += " Where genres.name in ('Blues', 'Latin', 'Pop','Classical') ";
    sql += " Limit 20 ";
    result = db.runSQL(sql,"table-auto");
    print(result);
    
    //2
    //List the first 20 song(track) names that are in the playlist Grunge. 

    sql  = " Select tracks.name from tracks ";
    sql += " Inner Join playlist_track ";
    sql += " On playlist_track.trackId = tracks.trackId ";
    sql += " Inner Join playlists ";
    sql += " On playlist_track.playlistId = playlists.playlistId ";
    sql += " Where playlists.name = 'Grunge' ";
    sql += " Limit 20 ";
    result = db.runSQL(sql,"table-auto");
    print(result);
    
      
  }    
}