package Collection;

public class LinkedList {

  public Node head;

  public void add(int n) {
    Node newNode = new Node(n);
    if (head==null) {
      head = newNode;
    }
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add(1);
    Node newNode = new Node(2);
    ll.head.next = newNode;
    System.out.println(ll.head.val);
    System.out.println(ll.head.next.val);
  }
}
