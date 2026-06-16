import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');  // This wll print the ascii value 
        System.out.println("a"+"b");  // This will concatenate the strings 

        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1);  //When an integer is concatenate with a string it is converted to its wrapper class
        //integer is converted to inger that will call toString()
        // it will same as "a"+"1"

        System.out.println("Kunal"+ new ArrayList<>());
        
        String anss= new Integer(56)+""+ new ArrayList<>();
        System.out.println(anss);

        
    }    
}
