public class SinglyLinkedList<E>
{
    private static class Node<E>
    {
        private E element;
        private Node<E> next;
        private Node(E e, Node<E> n)
        {
            element = e;
            next = n;
        }

        public E getElement()
        {
            return element;
        }
        public Node<E> getNext()
        {
            return next;
        }
        public void setNext(Node<E> n)
        {
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList(){}

    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    //返回第一个元素
    public E first()
    {
        if(isEmpty())
        {
            return null;
        }
        return head.getElement();
    }
    //返回最后一个元素
    public E last()
    {
        if(isEmpty())
        {
            return null;
        }
        return tail.getElement();
    }
    //不带头结点
    //头插法
    public void addFirst(E e)
    {
        head = new Node<>(e, head);     //创建一个新的结点并连接
        if(size == 0)
        {
            tail = head;
        }
        size++;
    }
    //尾插法
    public void addLast(E e)
    {
        Node<E> newest = new Node<>(e, null);
        if(isEmpty())
        {
            head = newest;
        }
        else
        {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }
    //删除第一个结点并返回该结点
    public E removeFirst()
    {
        if(isEmpty())
        {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0)
        {
            tail = null;
        }
        return answer;
    }
    //打印结点
    public void printNode()
    {
        if(isEmpty())
        {
            System.out.println("List is Empty!");
            return;
        }
        Node<E> temp = head;
        while(temp.getNext() != null)
        {
            System.out.print(temp.getElement());
            System.out.print(" ");
            temp = temp.getNext();
        }
        System.out.print(temp.getElement());        //打印最后一个结点
    }
}
