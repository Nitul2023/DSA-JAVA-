import java.util.Scanner;

public class String_builder{
    /*public static void main(String[] args) {
        //Declare of string builder
        // StringBuilder sb=new StringBuilder("Tony");
        // System.out.println(sb);

        // System.out.println(sb.charAt(0));

        // //set char at index
        // sb.setCharAt(0, 'M');
        // System.out.println(sb);


        // //Insert a Character at Some Index
        // sb.insert(2,'n');
        // System.out.println(sb);

        // // Delete char at some Index(delete the extra index 'n')
        // sb.delete(2, 3);  //2,3 means it delete from 2 and 3sa aaga tak delete karega
        // System.out.println(sb);


        //Append a char (means insert the element at the last)
        StringBuilder sb=new StringBuilder("H");
        sb.append('e');     //in string     str=str+'e'
        sb.append('l');                 //  str=str+'l'
        sb.append('l');
        sb.append('o');
        System.out.println(sb);
        System.out.println(sb.length());
    
    }
    */

    //Reverse a String (using StringBuilder class)

    /*public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        for (int i = 0; i <sb.length()/2; i++) {
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
    */


    //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.(using string builder)
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        sc.nextLine(); // consume newline
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<sb.length();i++){
            System.out.println("Enter the string: ");
            String str=sc.nextLine();
            sb.append(str);
        }

        int totalLength=sb.length();
        System.out.println(totalLength);
    }
}