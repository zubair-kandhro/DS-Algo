class SingleLinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode;
            }
        }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node tempNode = head;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            
    }  
    public void deleteFirst(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        head = head.next;

    }  
    public void deleteLast(){
        if(head == null){
            System.out.print("Linkedlist is empty");
        }
        else{
        Node tempNode = head;
        Node curNode = head.next;
        while(curNode.next != null){
            curNode = curNode.next;
            tempNode = tempNode.next;
            
        }
        tempNode.next  = null;
        }
    }
    public void addBeforePosition(int data, int pos){
        if(head == null){
            System.out.print("Linkedlist is empty");
        }
        else{
            Node newNode = new Node(data);
            Node temp = head;
            int count=1;
            if(count == pos){
                newNode.next = head;
                head = newNode;
            }
            else{
            while(count < pos){
                count++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            }   
        }
    }
        

    public void addAfterPosition(int data, int pos){
        if(head == null){
            System.out.print("Linkedlist is empty");
        }
        else{
            Node newNode = new Node(data);
            Node temp = head;
            int count=1;
            while(count < pos){
                count++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        
    }

    public void addAfterNode(int data, int targetData){
        if(head == null){
            System.out.print("Linkedlist is empty");
        }
        else{
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.data != targetData){
                temp = temp.next;
                if(temp == null){
                    System.out.println("Node data not matched in this list");
                    return;
                }
            }
            newNode.next = temp.next;
            temp.next = newNode;
            
            
        }
    }

    public void addBeforeNode(int data, int targetData){
        if(head == null){
            System.out.print("Linkedlist is empty");
        }
        Node newNode = new Node(data);
            Node temp = head;
        if(head.data == targetData){
                newNode.next = head;
                head = newNode;
        }
        else{
            while(temp.next != null &&  temp.next.data != targetData){
                temp = temp.next;
                
            }
            if(temp.next == null){
                    System.out.println("Node data not matched in this list");
                    return;
                }
            newNode.next = temp.next;
            temp.next = newNode;
            
            
        }
    }

        

    public void printList(){
        Node tempNode = head;
        if(head == null)
            System.out.print("LinkedList is empty");
        else{
            while(tempNode != null){
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }
        }
    } 

    public void size(){
        if(head == null){
            System.out.print("Linkedlist is empty");
        }
        else{
            Node temp = head;
            int count=0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
             System.out.print("\nSize of linkedlist is: " + count);
            
        }
    }      




    public static void main(String[] args){
        SingleLinkedList list = new SingleLinkedList();

        
        
        
       list.addFirst(5);
       list.addFirst(4);
       list.addFirst(2);
       list.addFirst(1);
       list.addBeforePosition(3,2);
       list.addAfterPosition(6,5);
       list.addAfterPosition(7,6);
       list.addBeforePosition(0,1);
       list.addAfterNode(-1, 5);
       list.addBeforeNode(-1, 10);
       list.addBeforePosition(100, 2);
        list.printList();
        list.size();
        

            
    }
}