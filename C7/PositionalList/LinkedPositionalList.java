/*使用双向链表实现positional list */
public class LinkedPositionalList<E> implements PositionalList<E>
{
    /*内嵌的结点类 */
    private static class Node<E> implements Position<E>
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
        public E getElement() throws IllegalStateException
        {
            if(next = null)
            {
                throw new IllegalStateException("Position no longer valid");
            }
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
        public void setElement(E e)
        {
            element = e;
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

    /*LinkedPositionalList变量实例 */
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    /*构造函数 */
    public LinkedPositionalList()
    {
        /*设置了哨兵，因此注意后续判断时的操作 */
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    /*私有的工具方法 */
    /*验证位置，返回结点 */
    private Node<E> validate(Position<E> p) throws IllegalArgumentException
    {
        if(!(p instanceof Node))        //判断是否是特定的类的实例
        {
            throw new IllegalArgumentException("Invalid p");
        }
        Node<E> node = (Node<E>) p;
        if(node.getNext() == null)
        {
            throw new IllegalArgumentException("p is no longer in the list");
        }
        return node;
    }

    /*将给定结点作为位置返回 */
    private Position<E> position(Node<E> node)
    {
        if(node == header || node == trailer)
        {
            return null;
        }
        return node;
    }

    /*公有的访问方法 */
    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    /*返回第一个位置 */
    public Position<E> first()
    {
        return position(header.getNext());
    }

    /*返回最后一个位置 */
    public Position<E> last()
    {
        return position(trailer.getPrev());
    }

    /*返回紧邻结点p前的结点 */
    public Position<E> before(Position<E> p) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        return position(node.getPrev());
    }

    /*返回紧邻结点p之后的结点 */
    public Position<E> after(Position<E> p) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        return position(node.getNext());
    }

    /*私有的工具方法 */
    /*在给定的结点间增加元素 */
    private Position<E> addBetween(E e, Node<E> pred, Node<E> succ)
    {
        Node<E> newest = new Node<>(e, pred, succ);
        pred.setNext(newest);
        succ.setPrev(newest);
        size++;
        return newest;
    }

    /*公有的更新方法 */
    /*表头插入新元素，返回其位置 */
    public Position<E> addFirst(E e)
    {
        return addBetween(e, header, header.getNext());
    }

    /*表尾插入新元素，返回其位置 */
    public Position<E> addLast(E e)
    {
        return addBetween(e, trailer.getPrev(), trailer);
    }

    /*位置p之前插入新元素，返回位置 */
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        return addBetween(e, node.getPrev(), node);
    }

    /*位置p之后插入新元素，返回位置 */
    public Position<E> addAfter(Position<E> p, E e)
    {
        Node<E> node = validate(p);
        return addBetween(e, node, node.getNext());
    }

    /*用新值代替位置p处的值，返回旧值 */
    public E set(Position<E> p, E e) throws IllegalArgumentException
    {
        Node<E> node = validate(p);
        E answer = node.getElement();
        node.setElement(e);
        return answer;
    }

    /*移除位置p处的元素，并返回，使p无效 */
    public E remove(Position<E> p) throws IllegalArgumentException
    {
        Node<E> node = validata(p);
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E answer = node.getElement();
        node.setElement(null);
        node.setNext(null);
        node.setPrev(null);
        return answer;
    }
}