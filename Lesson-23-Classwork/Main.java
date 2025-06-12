class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

  }



  double avgArray(int[] n){
    return sumArray(n)/n.length;
  }
  
  int sumArray(int[] n){
    int sum=0;
    for(int x=0; x<=n.length-1; x++){
      sum+=n[x];
    }
    return sum;
  }

  
}