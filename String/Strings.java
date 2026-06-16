import java.util.Scanner;

public class Strings {
    /*public static void main(String[] args) {
        // String Fname="Nitul";
        //Taking Input
        Scanner sc=new Scanner(System.in);
        // String name =sc.nextLine();

        //concatenation (Joinging of 2 strings)
        String fname=sc.next();
        String lname=sc.next();
        String fullname=fname+" "+lname;
        System.out.println(fullname);

        //length of the srting 
        System.out.println(fullname.length());

        //access character 
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
    */

    //compare two strings 
    /*public static void main(String[] args) {
        String name1="Nitul";
        String name2="Nitul";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        
        //OR
        if(name1.equals(name2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //Not a valid ,because it gives wrong ans
        if(new String("Tony")== new String("Tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
    */


    //substring
    /*public static void main(String args[]) {
        String name = "TonyStark";
    
        // System.out.println(name.substring(0, 4));
        String sentance="My name is Nitul";
        String name1=sentance.substring(11,sentance.length());
        System.out.println(name1);
    }
    */


    /*public static void main(String[] args) {
        //convert--> String to integer
        String str="1234";
        int num=Integer.parseInt(str);
        System.out.println(num);
        
        //convert--> Integer to String
        int number=12345;
        String strg=Integer.toString(number);
        System.out.println(strg);
    }
    */


/*<-- Practice Problem--> */
    //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=sc.nextInt();
        String array[]=new String[size];
        
        int count =0;
        for(int i=0;i<size;i++){
            array[i]=sc.next();
            count +=array[i].length();
        }

        System.out.println(count);
    }
    */

//  Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
//  Example : 
//  original = “eabcdef’ ; result = “iabcdif”
//  Original = “xyz” ; result = “xyz”
    /*public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter an array: ");
        String str=sc.next();
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result+='i';
            } else{
                result +=str.charAt(i);
            }
        }
        System.out.println(result);
    }
    */


//  Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//  Example : 
//  email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
//  email = “helloWorld123@gmail.com”; username = “helloWorld123”

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the email: ");
        String email=sc.next();
        String userName="";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            } else {
                userName +=email.charAt(i);
            }
        }
        System.out.println("User Name is "+userName);
    }


}
