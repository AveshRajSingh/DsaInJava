public class linkedList {
    private  Node head;
    private Node tail;
    private int size;

    public linkedList(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail = head;
        }
        size +=1;
    }
    public void insertLast(int value){
        if(tail == null ){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;


    }
    public void insert (int value, int index){
        if (index== 0 ){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.value+"-->");
            temp =  temp.next;
            if (head==null && tail == null){
                System.out.println("Empty linked list");
            }
        }
        System.out.println("END");
    }
    public void deleteFirst(){
        head = head.next;
        size--;
        if (head == null){
            tail=null;
        }
    }
    public void deleteLast(){
        if (size<=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next=null;
    }
    public int  delete(int index){
        if (index == 0) {
            deleteFirst();
        }
        if (index==size-1){
            deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.value;
        return val;
    }
    public Node Find (int value ){
        Node node = head ;
     while ( node !=null){
         if (node.value==value){
             return node;
         }
         node =node.next;
     }
        return null;
    }
    public Node get (int index ){
        Node node = head ;
        for (int i = 0; i < index; i++) {
            node =node.next;
        }
        return node;
    }

    private class Node {
        private int value ;
        private Node next;
        public Node (int value ){
            this.value=value;
        }
        public Node (int value , Node next){
            this.value = value;
            this.next = next;
        }
    }

}
