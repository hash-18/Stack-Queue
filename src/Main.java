public class Main {
    public static void main(String args[])
    {
        StackImpl s=new StackImpl(3);
        s.isEmpty();
        s.isFull();
        s.peek();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.peek();
        s.pop();
        s.pop();
        s.pop();
    }
}

class StackImpl {

    int size;
    int arr[];
    int top;

    public StackImpl(int size)
    {
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }

    public Boolean isEmpty()
    {
        return (top==-1);
    }

    public Boolean isFull()
    {
        return (top==size-1);
    }

    public void push(int ele)
    {
        if (!this.isFull()) {
            arr[++top] = ele;
            System.out.println("Element pushed : " + ele);
        }
        else
            System.out.println("Stack Overflow");
    }

    public int pop()
    {
        if(!this.isEmpty())
        {
            System.out.println("Element popped " + arr[top]);
            return arr[top--];
        }
        else {
            System.out.println("Empty stack : ");
            return -1;
        }
    }

    public int peek()
    {
        if(!this.isEmpty())
        {
            System.out.println("Element at peek "+ arr[top]);
            return arr[top];
        }
        else {
            System.out.println("Empty stack : ");
            return -1;
        }

    }
}