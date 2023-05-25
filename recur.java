/**
 * recur
 */
public class recur {
    static class Node{
       Node next;
       int data;
       Node(int a)
       {
        data = a;
       }
    }

    public static void main(String[] args) {
       Node head= new Node(10);
       Node b=new Node(20);
       head.next=b;
       print(head);       
    }
    //recursive printing function
    public static void print(Node head)
    {
        if(head==null){
            return;
        }
        System.out.println(head.data+" ");
        print(head.next);
    }
}