/**
 * insertAtEnd
 */
public class insertAtEnd {

    static class Node{
        Node next;
        int data;
        Node(int a){
            data=a;
        }
    }
    static class linked
    {
        public Node end(Node head, int data)
        {
            Node curr;
            Node a=new Node(data);
            if(head==null){
                return a;
            }
            else{
                curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=a;
                return head;
            }
        }
        public void print(Node head)
        {
           while(head!=null){
            System.out.println(head.data);
            head=head.next;
           }
        }
        public Node del(Node h)
        {
            if(h==null){
                System.out.println("linked list empty");
            }
            else{
                h=h.next;
            }
            return h;
        }
    }
    public static void main(String[] args) {
        linked nn=new linked();
        Node head=null;
        head=nn.end(head,19);
        head=nn.end(head,20);
        head=nn.end(head,21);
        head=nn.end(head,22);
        nn.print(head);
        head=nn.del(head);
        System.out.println();
        nn.print(head);
    }
}