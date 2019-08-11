public class ArrayQueue<E> implements Queue<E>
{
    /*变量实例 */
    public static final int CAPACITY = 10;
    private E[] data;
    private int f = 0;      //队首元素的索引
    private int sz = 0;     //当前的元素个数

    /*构造函数 */
    public ArrayQueue()
    {
        this(CAPACITY);
    }
    public ArrayQueue(int capacity)
    {
        data = (E[]) new Object[capacity];
    }

    /*方法 */
    public int size()
    {
        return sz;
    }
    public boolean isEmpty()
    {
        return (sz == 0);
    }
    /*队尾插入元素 */
    public void enqueue(E e) throws IllegalStateException
    {
        if(sz == data.length)
        {
            throw new IllegalStateException("Queue is full");
        }
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }
    /*返回队首元素 */
    public E first()
    {
        if(isEmpty())
        {
            return null;
        }
        return data[f];
    }
    /*移除并返回队首元素 */
    public E dequeue()
    {
        if(isEmpty())
        {
            return null;
        }
        E answer = data[f];
        data[f] = null;
        f = (f+1) % data.length;
        sz--;
        return answer;
    }
}