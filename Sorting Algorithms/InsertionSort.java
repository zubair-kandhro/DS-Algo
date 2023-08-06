public class InsertionSort{

    public void sort(int[] arr){

        for(int i=1; i<arr.length; i++){
            int cur = arr[i];
            int j = i-1;

            while(j >= 0 && cur < arr[j]){
               arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = cur;
        }
    }

    public void printArray(int[] arr){
        System.out.println("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        InsertionSort is = new InsertionSort();

        int[] arr = {10,1,200,25,0};
        is.sort(arr);

        is.printArray(arr); 
    }
}