public class DoubleLinkedList{
    Node head;
    Node tail;
    int size=0;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
           newNode.next = head;
           head.prev = newNode;
           head = newNode;
           size++;
        }

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
        }
    }

    public void addAtPosition(int data, int position){
        Node newNode = new Node(data);
        
        if(position == 1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
        else{
            int pos = 2;
            Node temp = head;
            while(temp != tail){
                if(position == pos){
                    newNode.next  = temp.next;
                    temp.next = newNode;
                    newNode.prev = temp; 
                    size++; 
                } 
                temp = temp.next;
                pos++;
            }
            if(temp == tail && position == pos){
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                pos++;
                size++;
            }
                   
        }  
    }

    public void removeValue(int value){
        if(head == null){
            System.out.print("List is empty");
        }
        if(value == head.data){
            head = head.next;
            size--;
        }
        else{
            Node temp = head;
            Node cur = head.next;
            while(cur.data != value){
                temp = temp.next;
                cur = cur.next;
            }
            temp.next = cur.next;
            size--;
        } 
    }

    public void removeAtPosition(int position){
        if(head == null){
            System.out.print("List is empty");
        }
        if(position == 1){
            head = head.next;
            size--;
        }
        else{
            int pos=2;
            Node temp = head;
            Node cur = head.next;
            while(cur != null){
                if(position == pos){
                    temp.next = cur.next;
                    cur.next.prev = temp;
                    size--;
                    break;
                }
                temp = temp.next;
                cur = cur.next;
                pos++;
                
            }
            
        } 
    }

    public void searchNode(int value){
        Node temp = head;
        int index=1;
        boolean found = false;
        while(temp != null){
            if(temp.data == value){
                System.out.println("\nYes, is available in list on position: " + index);
                found = true;
                break;
            }
            temp = temp.next;
            index++;
        }
        if(!found){
             System.out.println("\nNo, " + value + " is not available in this list.");
        }
    }

    public void size(){
        System.out.println("\nSize of list is: " + size);
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }  
      
    }

    public void printBackward(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        
    }

   public void firstNode() {
        if(head != null){
        System.out.println("\nThe first node is: " + head.data);
        }
        else{
        System.out.println("List is empty");
        }
    }

    public void LastNode() {
        if(tail != null){
        System.out.println("The Last node is: " + tail.data);
        }
        else{
        System.out.println("List is empty");
        }
    }
    



public static void main(String[] args){
    DoubleLinkedList list = new DoubleLinkedList();

    list.addFirst(9);
    list.addFirst(7);
    list.addFirst(5);
    list.addFirst(2);
    list.addFirst(4);
    list.addFirst(6);
    
    
   // list.addAtPosition(100, 7);
   // list.removeValue(100);
    list.removeAtPosition(3);
    list.removeAtPosition(8);
    list.printList();

    //list.searchNode(7);
    list.size();
    list.printBackward();
    list.firstNode();
    list.LastNode();
    

}
}