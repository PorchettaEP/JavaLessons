class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    int nums[] = {54,32,34,65,87,45,100,23,99,95,87,56,83};

    print(avgDist(nums));

    String[] students={"Joe","Snoopy","Homer","Beavis","Zen"};
    print(findStudent(students,"Homer"));
    print(findStudent(students,"Tim"));
  }

  boolean findStudent(String[] names, String name){
    for(int x=0; x<=names.length-1; x++){
      String student = names[x];
      if(student.equals(name)){
        return true;
      }
    }
    return false;
  }

  double avgDist(int[] nums){
    int sum =0;
    double avg = avgArray(nums);
    for(int x=0; x<=nums.length-1; x++){
      sum+= Math.pow(nums[x]-avg,2);
    }
    return Math.sqrt(sum);
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