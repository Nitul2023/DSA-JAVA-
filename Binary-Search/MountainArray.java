public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,3,2,1};
        int target = 3;
    }
    int search(int[] arr, int target) {
        int peak = findInMountainArray(arr);
        int firstTry =orderAgnosticBS(arr, target, 0 ,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1 ,arr.length-1);
    }
    public int findInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]> arr[mid+1]){
                //you are in the decreasing part of the array
                // this may be the ans, but look at left
                // this is why end is not = mid -1
                end =mid;
            }else {
                // you arein ascending part of the array
                start = mid+1; //because we khow that mid+1 element>mid element
            }
        }
        // in the end ,start == end and pointing to the largest number becauseof the 2 checks above
        // start end end  are always trying to find the macx element in the above 2 checks 
        // hence , when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration : at every point of time for start and end, they have the best possible ans till that time 
        // and if we are saying that only one item is remaining, hence because of the above line  the best possible ans 
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
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
