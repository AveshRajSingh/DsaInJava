public class Main {
public static void main(String[] args)
 {
  linkedList list = new linkedList();
    list.insertFirst(30);
     list.insertFirst(4);
     list.insertFirst(35);
     list.insertFirst(23);
     list.insertFirst(10);
     list.insertLast(99);
     list.insert(34,4);
  list.display();
  list.deleteLast();
     list.display();
     System.out.println(list.delete(2));
    }
}
