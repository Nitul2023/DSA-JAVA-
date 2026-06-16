public class EvenDigit {
    //find number of numbers that have even number of digits 
    public static void main(String[] args) {
        int[] nums= {12,345,2,6,7896,8855};

        System.out.println(findNumbers(nums));

        System.out.println(even(1234));

        System.out.println(digits(-75846));

        System.out.println(digits2(8784));

    }

    //using this we can find whether the number contains evcen digits or not
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)){
                count ++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digits or not 
    static boolean even(int num){
        int numberOfDigits=digits(num);
        /* 
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
        */
        return numberOfDigits %2 ==0;
    }

    //count the number of digits in a number
    static int digits(int num){
        if(num<0){
            num=num * -1;
        }

        if(num==0){
            return 1; 
        }

        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


    //shortcart to find the digits of a numebr
    static int digits2(int num){
        if(num<0){
            num=num * -1;
        }
        
        return (int)(Math.log10(num)) + 1;
    }
}
