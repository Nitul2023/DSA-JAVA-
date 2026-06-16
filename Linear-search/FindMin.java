public class FindMin {
    //find min element in thr array 
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28,-9};
        System.out.println(min(arr));
    }

    //assume arr.length is not 0
    //return the min the value in the array 
    static int min(int[] arr){
        int ans =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
