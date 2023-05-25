public class recurSive {
    static class Node{
       Node next;
       int data;
       Node(int a)
       {
          data=a;
       }
    }
    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);

        int y=searchlist(head, 30);
        System.out.println(y);
    }
    public static int searchlist(Node head, int z)
    {
       if(head==null){
        return -1;
       }
       if(head.data==z){
        return 1;
       }
       else{
        int r=searchlist(head.next, z);
        if(r==-1){
            return -1;
        }
        else{
            return r+1;
        }
       }
    }
}
