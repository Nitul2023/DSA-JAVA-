import java.util.Scanner;

public class FunctionsPractice {
    //Enter 3 numbers from the user & make a function to print their average.
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int avg=(a+b+c)/3;
        System.out.println(avg);

    }
    */

    //Write a function to print the sum of all odd numbers from 1 to n.
    /*public static int printSum (int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        printSum(n);
    }*/


    //Write a function which takes in 2 numbers and returns the greater of those two.
    /*public static int getGrater(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Greater number is -"+getGrater(a,b));
    }*/



    //Write a function that takes in the radius as input and returns the circumference of a circle.
    /*public static Double printArea(Double radius){
        return 2 * 3.14 * radius;
    }

    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.print("Area is "+ printArea(r));
    }*/



    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    /*public static int checkEligibility(int n){
        if(n>18){
            System.out.println("Eligible to vote.");
        }else {
            System.out.println("Not eligible to vote ");
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        checkEligibility(age);
    }
    */


    //Write an infinite loop using do while condition.
    /*public static void main(String[] args) {
        int n;
        do{ 
            System.out.println("Loop");
        }while (true);
    }
    */



    //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    /*public static void main(String args[]) {
        int positive = 0, negative = 0, zeros = 0;
        System.out.println("Press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1) {
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            if(number > 0) {
                positive++;
            } else if(number < 0) {
                negative++;
            } else {
                zeros++;
            }


            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();
        }


        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);
    }
    */

    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static int printPower(int x,int n){
        int result=1;
        for(int i=0;i<=n;i++){
            result=result*x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Enter n");
        int n=sc.nextInt();

        System.out.println(printPower(x, n));
    }
    
}



//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)


/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
*/