public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {70 ,20,50,30,80,10,40};
        
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            // Swap the minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    
}
