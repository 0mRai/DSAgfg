/**
 * insertAtAny
 */
public class insertAtAny
{
    static class Node
    {
        Node next;
        int data;
        Node(int a)
        {
            data=a;
        }
    }
    static class b
    {
        // public Node inserting(Node head, int pos, int d)
        // {
        //     Node n= new Node(d);
        //     // a.data=d;
        //     if(pos==1)
        //     {
        //         n.next=head;
        //         head=n;
        //         return head;
        //     }
        //     Node curr=head;
        //     for(int i=1;i<=pos-2&&curr!=null;i++)
        //     {
        //         curr=curr.next;
        //     }
        //     if(curr==null)
        //     {
        //         return curr;
        //     }
        //     n.next=curr.next;
        //     curr.next=n;
        //     return head;
            
        // }
        public Node insertt(Node head, int data)
        {
            Node a=new Node(data);
            if(head==null)
            {
                return a;
            }
            else
            {
                Node curr=head;
                while(curr.next!=null)
                {
                    curr=curr.next;
                }
                curr.next=a;
                return head;
            }
        }
        //why is this function not able to access next and showing error?
        public void printMiddle(Node head)
        { 
            if(head==null)
            {
                return;
            }
            Node fast=head;
            Node slow=head;
            while(fast!=null&&fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println(slow.data);
        }

        public void print(Node head)
        {
            while(head!=null)
            {
                System.out.println(head.data);
                head=head.next;
            }
        }
    
 }
 public static void main(String[] args) {
    Node head=null;
    b aa=new b();
    head=aa.insertt(head, 5);
    head=aa.insertt(head, 6);
    head=aa.insertt(head, 7);
    head=aa.insertt(head, 9);
    aa.print(head);
    System.out.println();
    aa.printMiddle(head);
    // head=aa.inserting(head, 4, 8);
    // System.out.println();
    // aa.print(head);
    // System.out.println();
    // aa.printMiddle(head);
}

}