public class CircularlyLinkedList<E>
{
    //结点复用
    private static class Node<E>
    {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n)
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

    //循环链表的实例变量
    private Node<E> tail = null;
    private int size = 0;
    public CircularlyLinkedList(){}

    //访问方法
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public E first()
    {
        if(isEmpty())
        {
            return null;
        }
        return tail.getNext().getElement();
    }
    public E last()
    {
        if(isEmpty())
        {
            return null;
        }
        return tail.getElement();
    }

    //更新方法
    public void rotate()        //将第一个元素旋转到表尾（循环队列）
    {
        if(tail != null)
        {
            tail = tail.getNext();
        }
    }
    public void addFirst(E e)
    {
        if(size == 0)
        {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        }
        else
        {
            Node<E> newest = new Node<>(e, tail.getNext());     //数据域e，指向原头结点
            tail.setNext(newest);       //将新结点设置为头结点，即tail.next
        }
        size++;
    }
    public void addLast(E e)
    {
        addFirst(e);
        tail = tail.getNext();      //将新结点设置为尾结点
    }
    public E removeFirst()
    {
        if(isEmpty())
        {
            return null;
        }
        Node<E> head = tail.getNext();
        if(head == tail)
        {
            tail = null;
        }
        else
        {
            tail.setNext(head.getNext());       //将尾结点与头结点的next连接
        }
        size--;
        return head.getElement();
    }

    //打印结点
    public void printNode()
    {
        if(isEmpty())
        {
            System.out.println("The list is empty!");
        }
        else
        {
            Node<E> temp = tail.getNext();      //临时结点，用于遍历链表
            while(temp != tail)
            {
                System.out.print(temp.getElement());
                System.out.print(" ");
                temp = temp.getNext();
            }
            System.out.print(tail.getElement());
        }
    }
}