public class StackImpl {

    int size;
    int arr[];
    int top;

    public StackImpl(int size)
    {
        this.size=size;
        this.arr[]=new int[size];
        this.size=-1;
    }

    public void isEmpty()
    {
        return (top==-1);
    }

    public void isFull()
    {
        return (top==size-1)
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

    public void pop()
    {
        if(!this.isEmpty())
        {
          System.out.println("Element popped")
          return arr[top--];
        }
        else {
            System.out.println("Empty stack : ")
            return -1;
        }
    }

    public int peek()
    {
        if(!this.isEmpty())
        {
            System.out.println("Element popped ")
            return arr[top];
        }
        else {
            System.out.println("Empty stack : ")
            return -1;
        }

    }
}

class Main()
{

}
