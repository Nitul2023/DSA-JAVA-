import java.util.*;
public class Array2D {
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        System.out.println("Enter Array");

        int[][] numbers=new int[rows][columns];

        //for rows 
        for(int i=0;i<rows;i++){
            //for columns
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array");

        for(int i=0;i<rows;i++){
            //for columns
            for(int j=0;j<columns;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    */

    //Take a matrix from the user as input.Search for a given number x in a matrix and print the indices.
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        System.out.println("Enter Array");

        int[][] numbers=new int[rows][columns];

        //for rows 
        for(int i=0;i<rows;i++){
            //for columns
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter x: ");
        int x=sc.nextInt();

        for(int i=0;i<rows;i++){
            //for columns
            for(int j=0;j<columns;j++){
                if(numbers[i][j]==x){
                    System.out.print("x found at location  ("+i+", "+j+")");
                }
            }
        }
        
    }
    */

    //For a given matrix of N x M, print its transpose.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] matrix=new int[n][m];

        //for rows 
        for(int i=0;i<n;i++){
            //for columns
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose is : ");

        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
