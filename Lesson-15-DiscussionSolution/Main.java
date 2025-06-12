class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    print(sumN(4));

    print(sum2Powers(4));

    print(fact(5));


  }

  /* 
  Write a function accepts a integer N and
  */
    int sumN(int N){
      int sum = 0;
      for(int x=1; x<=N;x++)
        sum+=x;

      return sum;
    }

    int sum2Powers(int N){
      int sum = 0;
      for(int x=1; x<=N;x++)
        sum+=Math.pow(2,x);

      return sum;
    }

  int fact(int n){
    int result=1;
    for(int i=2; i<=n; i++)
      result *= i;

    return result;
  }

  
  


  
}