public class SearchInRange {
    //Search for 3 in the range of index[1,4]
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int target=3;
        System.out.println(linearSearchjava(arr, target, 1, 4));
    }
    static int linearSearchjava (int[] arr,int target,int start, int end) {
        if(arr.length==0){
            return -1;
        }

        for(int i=start;i<=end;i++){
            //check for element at every index if it is =target 
            int element=arr[i];
            if(element== target){
                return i;
            }
        }
        return -1;
        //this line will be executed if none of the above return statements have executed
    }
}
