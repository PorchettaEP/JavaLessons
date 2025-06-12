class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    Animal wolf = new Animal("Wolf",90,30.3);
    Animal goat = new Animal("goat",30,20.1);

    if(wolf.isHealthy()){
      print("Wolf is healthy");
    }
    else{
      print("Wolf is unhealthy");
    }
    
    if(goat.isHealthy()){
      print("goat is healthy");
    }
    else{
      print("goat is unhealthy");
    }
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}