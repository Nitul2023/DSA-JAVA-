public class PeakIndex {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,6,4,3,2};
        System.out.println(peakIndexFound(arr));

    }
    static int peakIndexFound(int[] arr){
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
}
