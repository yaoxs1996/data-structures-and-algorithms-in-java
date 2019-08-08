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
        public setNext(Node<E> n)
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
    }
    }
}