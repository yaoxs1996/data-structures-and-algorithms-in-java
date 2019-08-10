public class ArrayStack<E> implements Stack<E>
{
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;

    public ArrayStack()
    {
        this(CAPACITY);
    }
    public ArrayStack(int capacity)
    {
        data = (E[]) new Object[capacity];      //安全的转换，但是编译器可能会警告
    }

    public int size()
    {
        return (t+1);
    }
    public boolean isEmpty()
    {
        return (t == -1);
    }
    public void push(E e) throws IllegalStateException
    {
        if(size() == data.length)
        {
            throw new IllegalStateException("Stack is full");
        }
        data[++t] = e;      //先增再存
    }
    public E top()
    {
        if(isEmpty())
        {
            return null;
        }
        return data[t];
    }
    public E pop()
    {
        if(isEmpty())
        {
            return null;
        }
        E answer = data[t];
        data[t] = null;     //方便垃圾回收
        t--;
        return answer;
    }
}