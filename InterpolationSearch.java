public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high &&
               target >= arr[low] &&
               target <= arr[high]) {
            
            int pos = low + ((target-arr[low])*(high-low))/(arr[high]-arr[low]);

            if(arr[pos] == target){
                return pos;
            }

            if (arr[pos] < target){
                low = pos + 1;
            } else{
                high = pos - 1;
            }
               }
               return -1;
    }
    public static void main(String[] args){
        int[] arr = {5,10,15,20,25,30,35,40,45,50,55,60,65,70};
        int target = 55;
        int result = interpolationSearch(arr,target);

        if(result != -1){
            System.out.println("Element found at index:" + result);
        }
    }
}