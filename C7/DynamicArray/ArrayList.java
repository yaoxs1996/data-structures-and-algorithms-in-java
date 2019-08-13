import java.util.List;

public class ArrayList<E> implements List<E>
{
    /*变量实例 */
    public static final int CAPACITY = 16;
    private E[] data;
    private int size = 0;

    /*构造函数 */
    public ArrayList()
    {
        this(CAPACITY);
    }
    public ArrayList(int capacity)
    {
        data = (E[]) new Object[capacity];
    }

    /*公有方法 */
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    /*返回索引i的元素 */
    public E get(int i) throws IndexOutOfBoundsException
    {
        checkIndex(i, size);
        return data[i];
    }
    /*使用e替换索引i的元素，并返回被替换值 */
    public E set(int i, E e) throws IndexOutOfBoundsException
    {
        checkIndex(i, size);
        E temp = data[i];
        data[i] = e;
        return temp;
    }
    /*插入元素 */
    public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException
    {
        checkIndex(i, size+1);
        if(size == data.length)
        {
            //throw new IllegalStateException("Array is full");
            resize(2 * data.length);
        }
        for(int k=size-1; k>=i; k--)
        {
            data[k+1] = data[k];
        }
        data[i] = e;
        size++;
    }
    /*删除并返回元素 */
    public E remove(int i) throws IndexOutOfBoundsException
    {
        checkIndex(i, size);
        E temp = data[i];
        for(int k=i; k<size-1; k++)
        {
            data[k] = data[k+1];
        }
        data[size-1] = null;
        size--;
        return temp;
    }

    /*实用方法 */
    /*检查给定的索引是否在范围[0, n-1]内 */
    protected void checkIndex(int i, int n) throws IndexOutOfBoundsException
    {
        if(i<0 || i>=n)
        {
            throw new IndexOutOfBoundsException("Illegal index: " + i);
        }
    }
    /*增大原有数组的容量 */
    protected void resize(int capacity)
    {
        E[] temp = (E[]) new Object[capacity];
        for(int k=0; k<size; k++)
        {
            temp[k] = data[k];
        }
        data = temp;
    }
}