class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String msg = Input.readFile("paragraph.txt");
    print(numOfWords(msg));
    print(countVowels(msg));
    
  

  }

  int numOfWords(String s){
    int count = 1;
    for(int x=0; x<=s.length()-1; x++){
      String symbol = s.substring(x,x+1);
      if(symbol.equals(" "))
        count++;
    }
    return count;
  }

  int countVowels(String s){
    int count=0;
    for(int x=0;x<=s.length()-1;x++){
      String ch = s.substring(x,x+1);
      if(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") ||
        ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") ||
        ch.equalsIgnoreCase("u") )
        count++;
    }
    return count;
  }
  
}