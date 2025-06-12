class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //create an array with know values
    int nums[] = {10,15,22,54,32,34,65,87,45,100,23,99,95,87,56,83};

    print(sumArray(nums));
    print(avgArray(nums));

    char[] studentAns = {'A','A','B','C','D','C'};
    char[] ansKey = {'A','B','B','C','D','C'};

    print(quizGrader(studentAns,ansKey));
  }

  //return the sum of an array
  int sumArray(int[] n){
    int sum=0;
    for(int x=0; x<=n.length-1; x++){
      sum+=n[x];
    }
    return sum;
  }

  //return the avg of the array
  double avgArray(int[] n){
    
    return sumArray(n)/(double)n.length;
  }
  // Quiz grader

  double quizGrader(char[] ans, char[] ansKey){
    int correctAns =0;
    for(int x=0;x<=ans.length-1; x++){
      if(ans[x] == ansKey[x]){
        correctAns++;
      }
    }
    return (double)correctAns/ans.length;
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}