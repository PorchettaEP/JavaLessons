import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
public class Main {

    public static void main(String[] args) throws IOException {
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException {
   

    // create a port - our Gateway
    int port = 8500;
      
    //create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    //create a route handler to repond the a request
    // this is our default route
    server.createContext("/", new RouteHandler("Hi there. This is the default route...") );
    
    // create a route called mypage
    String html = "<html><body><marquee>THIS IS MY WEBPAGE</marquee></body></html>";
    server.createContext("/myPage", new RouteHandler(html) );

    html = Input.readFile("index2.html");
    server.createContext("/webPage", new RouteHandler(html) );


    //Start the server

      
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


