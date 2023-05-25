public class search 
{
    static class Node
    {
        Node next;
        int data;
        Node(int a)
        {
         data = a;
        }
     }
     public static void main(String[] args) {
        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(50);
        head.next=b;
        b.next=c;

        find(head, 50);
     }
     public static void find(Node head, int x)
     {
        Node curr=head;
        int temp=1;
        while(curr!=null)
        {
        if(curr.data==x){
           System.out.println(temp);
           break;
        }
        else{
            curr=curr.next;
            temp++;
        }
       }


     }
}
