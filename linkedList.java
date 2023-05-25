class linkedList{
    static class node{
        node next;
        int data;
        node(int a){
            data=a;
        }
    }
    public static void main(String[] args) {
        node head = new node(10);
        node c = new node(20);
        node d = new node(30);
        head.next=c;
        c.next=d;
        print(head);
    }
    public static void print(node head)
    {
      node curr=head;
      while(curr!=null)
      {
        System.out.println(curr.data+" ");
        curr=curr.next;
      }
    }
}