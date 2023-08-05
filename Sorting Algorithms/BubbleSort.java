public class BubbleSort{

    public void sort(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void printArray(int[] arr){
        System.out.println("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){

        BubbleSort bs = new BubbleSort();

        int[] arr = {10,-1,200,25,0};
        bs.sort(arr);

        bs.printArray(arr);     
    }
}