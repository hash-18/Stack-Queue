public class LL {

    Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
        public void addFirst(String data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                return;
            }
                newNode.next=head;
                head=newNode;
        }

        public void addLast(String data)
        {
            Node newNode=new Node(data);
            Node currentNode=head;
            if(head==null)
            {
                head=newNode;
                return;
            }
            while(currentNode.next!=null)
            {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;

        }

        public void print()
        {
            if(head==null)
            {
                System.out.println("EMpty LL");
                return;
            }
            Node currentNode=head;
            while(currentNode!=null) {
                System.out.print(currentNode.data + "->");
                currentNode = currentNode.next;
            }
        }

        public void removeFirst()
    {
        if(head==null) {
            System.out.println("Empty List");
            return;
        }
        head=head.next;

    }

    public void removeLast()
    {
        if(head==null) {
            System.out.println("Empty List");
            return;
        }
        //if there's only one node
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;

        while(lastNode.next!=null)
        {
            secondLastNode=lastNode;
            lastNode=lastNode.next;
        }
        secondLastNode.next=null;
    }

    public void reverseIterate()
    {
        if(head==null || head.next==null)
            return;
        Node previousNode=head;
        Node currentNode=head.next;
        while(currentNode!=null)
        {
            Node nextNode=currentNode.next;
            currentNode.next=previousNode;

            //updating the nodes
            previousNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        head=previousNode;
    }

    public Node reverseRec(Node head)
    {
        if(head==null || head.next==null)
            return head;

        Node newHead=reverseRec(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;

    }




    public static void main(String[] args)
    {
        LL list=new LL();
        list.print();
        list.addFirst("10");
        list.addFirst("20");
        list.addFirst("30");
        list.print();

        list.addLast("11");
        list.addLast("21");
        list.addLast("31");
        System.out.println();
        System.out.println("Added elements at last");
        list.print();
        list.removeLast();
        System.out.println();
        System.out.println("Removed last element");
        list.print();
        list.removeFirst();
        System.out.println();
        System.out.println("Removed first element");
        list.print();
        System.out.println();
        System.out.println("Reversing Link List using iterative method");
        list.reverseIterate();
        list.print();
        System.out.println();
        System.out.println("Reversing Link List using Recursive method");
        list.head=list.reverseRec(list.head);
        list.print();




    }
}
