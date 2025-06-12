class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    print(addNums());

    print(generatePin());
  }

  //1
  String addNums(){
    int n1 = (int)(Math.random()*(50-(-5)+1)-5);
    int n2 = (int)(Math.random()*(50-(-5)+1)-5);
    return n1+" + "+n2+"= ?";
  }

  //2
  String generatePin(){
    int n1 = (int)(Math.random()*(8-3+1)+3);
    int n2 = (int)(Math.random()*(8-3+1)+3);
    int n3 = (int)(Math.random()*(8-3+1)+3);
    int n4 = (int)(Math.random()*(8-3+1)+3);
    return n1+" "+n2+" "+n3+" "+n4;
    
  }
}