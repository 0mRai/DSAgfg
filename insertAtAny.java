/**
 * insertAtAny
 */
public class insertAtAny {

    static class Node{
        Node next;
        int data;
        Node(int a){
            data=a;
        }
    }
    static class insert{
        public Node inserting(Node head, int pos, int d){
            Node n= new Node(d);
            // a.data=d;
            if(pos==1){
                n.next=head;
                head=n;
                return head;
            }
            Node curr=head;
            for(int i=1;i<=pos-2&&curr!=null;i++){
                curr=curr.next;
            }
            n.next=curr.next;
            curr.next=n;
            return head;
            
        }
        public Node insertt(Node head, int data){
            Node a=new Node(data);
            if(head==null){
                return a;
            }
            else{
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=a;
                return head;
            }
        }
        public void print(Node head){
            while(head!=null){
                System.out.println(head.data);
                head=head.next;
            }
    }
    
 }
 public static void main(String[] args) {
    Node head=null;
    insert aa=new insert();
    head=aa.insertt(head, 5);
    head=aa.insertt(head, 6);
    head=aa.insertt(head, 7);
    head=aa.insertt(head, 9);
    aa.print(head);
    head=aa.inserting(head, 4, 8);
    System.out.println();
    aa.print(head);
}
}