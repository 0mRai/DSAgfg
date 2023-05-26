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
    static class linked{
        Node head;
        Node curr;
        public void end(int data){
            Node a=new Node(data);
            if(head==null){
                head=a;
            }
            else{
                curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=a;
            }
        }
        public void print(){
           while(head!=null){
            System.out.println(head.data);
            head=head.next;
           }

        }
    }
    public static void main(String[] args) {
        linked nn=new linked();
        nn.end(19);
        nn.end(20);
        nn.end(21);
        nn.end(22);
        nn.print();
    }
}