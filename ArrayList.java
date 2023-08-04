public class ArrayList{
    int[] arr;
    int pointer=0;

    public ArrayList(int size){
        arr = new int[size];
    }

    public void add(int data){
        if(pointer < arr.length){
            arr[pointer] = data;
            pointer++;
        }
        else{
            int[] temp = new int[(arr.length)*2];
            for(int i=0; i<arr.length; i++){
                temp[i] = arr[i];
            }
            arr = temp;
            arr[pointer] = data;
            pointer++;
        }
        
    }

    public void remove(){
        if(pointer > 0){
            pointer--;
            int x = arr[pointer];
            System.out.println(x);
        }
    }

    public void printList(){
        for(int i=0; i<pointer; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public int size(){
        return pointer;
    }

    public void deleteAtPos(int pos){
        if(pos <0 || pos >pointer){
            return;
        }
        else{
            int[] temp = new int[arr.length - 1];
            int j=0;
            for(int i=0; i<arr.length; i++){
                if(i != pos){
                    temp[j] = arr[i];
                    j++;
                }
            }
            arr = temp;
            pointer--;
        }
    }

    public void indexOf(int target){
        for(int i=0; i<pointer; i++){
            if(target == arr[i]){
                System.out.println("Index of " + target + " is: " + i);
                return;
            }
        }
    }

    public static void main(String[] args){
        ArrayList list = new ArrayList(5);
        //list.arrayList(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(10);
        list.add(11);
        list.remove();
        //list.remove();
        list.deleteAtPos(5);
        list.printList();
        //System.out.println(list.size());
       

    }
}
