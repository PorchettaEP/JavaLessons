class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
    print(approxPi(5));

  }

  double approxPi(int terms){
    double sum=0;
    int sign=1;
    for(int i = 1; i<terms*2; i+=2){
      sum+= sign*(1.0/i);
      sign*=-1;
    }
    return 4*sum;
  }  
  
  double approxPi2(int terms){
    double sum=0;
    for(int i = 1; i<=terms; i++){
      sum+= Math.pow(-1,i-1)*(1./(2*i-1));
    }
    return 4*sum;
  }  
  
}