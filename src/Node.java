public class Node {

    private Node next;
    private int val;

      Node(int val) {
          this.val = val;
      }
      Node(int val, Node next) {
          this.val = val;
          this.next = next;
      }

    public static Node reverseList(Node head) {
        Node prev =null;
        if(head==null){return head;}
        Node curr =head;

        while(curr!=null){
            Node n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }
    public static void printLinkedList(Node head){

          if (head==null){
              System.out.println("null");
              return;
          }
          while(head!=null){
              System.out.print(head.val+"-> ");
              head=head.next;
          }
        System.out.println("null");
    }
}
