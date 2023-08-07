import java.util.Arrays;
public class MergeSort{
    public static void mergeSort(int[] data, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(data, start, mid);
            mergeSort(data, mid+1, end);
            merge(data,start,end);
        }
    }

    public static void merge(int[] data, int start, int end){
        int[] temp = new int[end-start+1];
        int mid = (start + end)/2;
        int i = start, j = mid + 1, k = 0;
        while(i <= mid && j <= end){
            if(data[i] <= data[j]){
                temp[k++] = data[i++];
            }
            else{
                temp[k++] = data[j++];
            }
        }
        while(i <= mid){
            temp[k++] = data[i++];
        }
        while(j <= end){
            temp[k++] = data[j++];
        }

        for(i = start; i <= end; i++){
            data[i] = temp[i-start];
        }
    }


    public static void main(String[] args) {
        int[] data = {12,5,2,86,45,4,8,1,0,4};
        mergeSort(data,0,data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}


/* import java.util.Arrays;
public class MergeSort {
    public static void mergeSort(int[] data, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(data, start, mid);
            mergeSort(data, mid+ 1, end);
            merge(data,start,end);
        }
    }

    public static void merge(int[] data, int start, int end){
        int[] temp = new int[end-start+1];
        int mid = (start + end)/2;
        int i = start, j = mid + 1, k = 0;

        while(i <= mid && j <= end){
            if(data[i] <= data[j]){
                temp[k++] = data[i++];
            }else{
                temp[k++] = data[j++];
            }
        }

        while(i <= mid){
            temp[k++] = data[i++];
        }
        while(j <= end){
            temp[k++] = data[j++];
        }

        for(i = start; i <= end; i++){
            data[i] = temp[i-start];
        }
    }
    public static void main(String[] args) {
        int[] data = new int[]{12,5,2,86,45,4,8,1,0,4};
        mergeSort(data,0,data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}
 */