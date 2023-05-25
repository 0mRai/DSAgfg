public class insertAtBegin {
    static class Node{
        Node next;
        int data;
        Node(int a){
            data=a;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head = insert(head, 5);
        head= insert(head, 8);
        print(head);

    }
    public static Node insert(Node head, int x){
        Node n=new Node(x);
        n.next=head;
        return n;

    }
    public static void print(Node head)
    {
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
