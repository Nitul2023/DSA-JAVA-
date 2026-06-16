
public class PrettyPrinting {
    public static void main(String[] args) {
        float a=453.12745f;
        // By using this i can print only those values numbers after the "." are necessary and also rounding off the number 
        System.out.printf("Formated number is %.2f",a);
        System.out.println(" ");

        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println(" ");
        
        System.out.printf("Hi i am %s and i meet you %s","Nitul","Yesterday");
    }
}
