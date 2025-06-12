class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  
  int randInt(int a, int b){
    return (int)(Math.random()*(b-a+1))+a;
  }

  
  void init(){
    experiment1();
    howLong();
    print(isPrime(1001));
    print(isPrime(37));
  }

   //Discussion 1: What is the first value of x where x^2 is 10000?
  int experiment1( ){
    int x = 0;
    while( Math.pow(x,2) < 10000){
      x++;
    }
    return x;
  }
  // add in a counter after initial demo
  void howLong(){
    int num = randInt(1,10);
    int count=1;
    
    while(num != 4){
      //what would happen if we took out line 34
      num = randInt(1,10);
      print(num);
      count++;
    }
    print("Count = "+count);
  }

  //isPrime
    boolean isPrime(int n){
    int divisor = 2;
    while( n % divisor !=0){
      divisor++;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }

  
 
}