public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {-18,-9,-5,0,1,2,3,8,9,15,22,25,30};
        int target = 22;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is accending or descending
        boolean isAcs =arr[start] < arr[end];


        while(start<=end) {
            //find the mid element 
            // int mid = (start + end)/2;    //might be possible that (start + end ) exceeds the range of int in java
            int mid = start +(end - start)/2;

            if(arr[mid] == target) {
                return mid;
            }
            if(isAcs){
                if(target < arr[mid]){
                    end =mid - 1;
                } else {
                    start = mid + 1;
                } 
            } else {
                if(target > arr[mid]){
                    end =mid - 1;
                } else {
                    start = mid + 1;
                } 
            }
        }
        return -1;
    }
}
