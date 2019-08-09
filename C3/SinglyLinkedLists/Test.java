public class Test
{
    public static void main(String[] args)
    {
        //注意类型参数只能代表引用型类型
        SinglyLinkedList<Integer> sList = new SinglyLinkedList<>();

        sList.printNode();
        
        sList.addFirst(1);
        sList.addFirst(2);
        sList.addFirst(3);
        sList.addFirst(4);
        sList.printNode();

        System.out.print("\n");
        System.out.println("链表长度为：" + sList.size());
        System.out.println("链表第一个元素为：" + sList.first());
        System.out.println("链表最后一个元素为：" + sList.last());

        System.out.println("移除的第一个元素为：" + sList.removeFirst());
        sList.printNode();
    }
}