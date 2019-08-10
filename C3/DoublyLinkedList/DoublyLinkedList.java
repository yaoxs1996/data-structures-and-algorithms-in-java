public class DoublyLinkedList<E>
{
    private static class Node<E>
    {
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E e, Node<E> p, Node<E> n)
        {
            element = e;
            prev = p;
            next = n;
        }
        public E getElement()
        {
            return element;
        }
        public Node<E> getPrev()
        {
            return prev;
        }
        public Node<E> getNext()
        {
            return next;
        }
        public void setPrev(Node<E> p)
        {
            prev = p;
        }
        public void setNext(Node<E> n)
        {
            next = n;
        }
    }

    //双向链表变量
    private Node<E> header;     //头哨兵
    private Node<E> trailer;        //尾哨兵
    private int size = 0;

    public DoublyLinkedList()
    {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext((trailer));
    }

    /*访问方法 */
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
        return header.getNext().getElement();
    }
    public E last()
    {
        if(isEmpty())
        {
            return null;
        }
        return trailer.getPrev().getElement();
    }

    /*私有的更新方法 */
    private void addBetween(E e, Node<E> predecessor, Node<E> successor)
    {
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }
    private E remove(Node<E> node)
    {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    /*更新方法 */
    public void addFirst(E e)
    {
        addBetween(e, header, header.getNext());
    }
    public void addLast(E e)
    {
        addBetween(e, trailer.getPrev(), trailer);
    }
    public E removeFirst()
    {
        if(isEmpty())
        {
            return null;
        }
        return remove(header.getNext());
    }
    public E removeLast()
    {
        if(isEmpty())
        {
            return null;
        }
        return remove(trailer.getPrev());
    }

    /*打印结点 */
    public void printAZ()       //顺序打印结点
    {
        if(isEmpty())
        {
            System.out.println("List is empty!");
            return;
        }
        Node<E> temp = header.getNext();
        while(temp != trailer)
        {
            System.out.print(temp.getElement());
            System.out.print(" ");
            temp = temp.getNext();
        }
    }
    public void printZA()       //逆序打印结点
    {
        if(isEmpty())
        {
            System.out.println("List is empty!");
            return;
        }
        Node<E> temp = trailer.getPrev();
        while(temp != header)
        {
            System.out.print(temp.getElement());
            System.out.print(" ");
            temp = temp.getPrev();
        }
    }
}