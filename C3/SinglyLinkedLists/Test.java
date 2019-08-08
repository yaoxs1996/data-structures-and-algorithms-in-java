public class Test
{
    public static void main(String[] args)
    {
        //注意类型参数只能代表引用型类型
        SinglyLinkedList<Integer> sList = new SinglyLinkedList<>();

        sList.addFirst(1);
        sList.addLast(2);
        sList.printNode();
    }
}