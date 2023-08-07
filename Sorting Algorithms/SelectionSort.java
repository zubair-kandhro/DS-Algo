public class SelectionSort{

    public void sort(int[] arr){
        int min, temp=0;
        for(int i=0; i<arr.length-1; i++){
             min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
                    
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void printArray(int[] arr){
        System.out.println("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){

        SelectionSort ss = new SelectionSort();

        int[] arr = {10,-1,200,25,0};
        ss.sort(arr);

        ss.printArray(arr);     
    }
}