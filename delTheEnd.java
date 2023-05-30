import java.util.*;
public class delTheEnd {
    static class Node{
        Node next;
        int data;
        Node(int a){
            data=a;
        }
    }
    static Node insert(Node head, int data){
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
    static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    static void deleteFromEnd(Node head){
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;

    }
    public static void main(String[] args) {
        Node head=null;
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the data");
        // int a=sc.nextInt();
        boolean i= true;
        while(i){
            System.out.println("enter the data");
            int a=sc.nextInt();
            head=insert(head,a);
            System.out.println("if you wish to continue enter true else false");
            i=sc.nextBoolean();

        }
        print(head);
        System.out.println();
        deleteFromEnd(head);
        print(head);
    }
}
