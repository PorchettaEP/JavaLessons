class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
  int num1 = 5;
  int num2 = 100;
  int sum = num1 + num2;
  System.out.println("sum is "+ sum);

/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
int grade1 = 80;
int grade2 = 74;
int grade3 = 99;

// ****NOTE**** I already declared the variable sum as an integer above so 
// I don't need to declare again. if I do I will get a syntax error.
sum = grade1 + grade2 + grade3;
System.out.println("sum of grades "+sum);


/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.

    Declare and assign values to any new variables

    NOTE: Does it look correct, check with a calculator?
*/

double avg = sum / 3.0;
System.out.println("avg is "+avg);

// **** NOTE **** since sum is an integer we don't want to divide by another integer
// 3 because we get integer division and the decimals will be truncated and lost. 
// So we divide by a real number 3.0

/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:

    Declare and assign values to any new variables

*/
  double A = 2.1;
  double x = 0.9;
  double y =0;
  y = A / (x+1);
  System.out.println("y is "+y);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:
*/
 // **** NOTE **** The variable y is already declared above so we don't need
 // to declare it.

  y= ( 2*x*(x+1)*(-x/2) ) / A;

  System.out.println("y is "+y);


/*  
    Challenge 6:
    Create the variables and write the equation in
    file EQ3 

    Declare and assign values to any new variables

*/
 
  double area =0;
  double b=4.5;
  double h=5.4;
  area = 1/2.0*b*h;
  System.out.println("area is "+ area);




/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/
    int totalNumOfEggs = 100;
    int numOfBasketsFilled =0;
    int remainingEggs = 0;

    // Use integer division to give us the quotient when dividing by 12

    numOfBasketsFilled = totalNumOfEggs / 12;
    System.out.println("Number of baskets filled: "+numOfBasketsFilled);

    // use the modulus operator to give you the remainder.
    remainingEggs = totalNumOfEggs % 12;
    System.out.println("Remaining number of eggs: "+remainingEggs);

    // Use integer division to give us the quotient when dividing by 12





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}