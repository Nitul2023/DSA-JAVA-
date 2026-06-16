import static java.io.IO.println;
import java.util.*;

public class excercise {
//    public static void main(String[] args) {
//        int[] arr = {7, 8, 9, 2, 3, 10, 55, 9};
//        int target = 55;
//        System.out.println(linearSearch(arr, target));
//    }
//
//    static int linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] == target) {
//                return index;
//            }
//        }
//        return -1;
//    }


//    public static void main(String[] args) {
//        String name = "Nitul";
//        char target = 'm';
//        System.out.println(search(name,target));
//    }
//
//    static boolean search(String str,char target) {
//        if(str.length()==0){
//            return false;
//        }
//        for (char c = 0; c < str.length(); c++) {
//            if(target==str.charAt(c)){
//                return true;
//            }
//        }
//        return false;
//    }


// Min number
//    public static void main(String[] args) {
//        int[] arr={5,6,8,9,8,6,45,2,8,6,2};
//        System.out.println(minNum(arr));
//    }
//
//    static int minNum(int[] arr){
//        int min=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        return min;
//    }


// Max number
//    public static void main(String[] args) {
//        int[] arr={5,6,8,9,8,6,45,2,8,6,2};
//        System.out.println(maxNum(arr));
//    }
//
//    static int maxNum(int[] arr){
//        int max= Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }


    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {5,8,7,9},
                {7,4,6,5}
        };
        int target=7;
        int[] ans=search2D(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] arr,int taregt){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < row; col++) {
                if (arr[row][col]==taregt){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}