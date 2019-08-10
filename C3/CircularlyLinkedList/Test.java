public class Test
{
    public static void main(String[] args)
    {
        CircularlyLinkedList<String> cList = new CircularlyLinkedList<>();

        cList.printNode();

        /*cList.addFirst("A");
        cList.addFirst("B");
        cList.addFirst("C");
        cList.addFirst("D");
        cList.addFirst("E");*/

        cList.addLast("A");
        cList.addLast("B");
        cList.addLast("C");
        cList.addLast("D");
        cList.addLast("E");

        cList.printNode();
        System.out.println("链表长度为：" + cList.size());
        System.out.println("链表第一个元素为：" + cList.first());
        System.out.println("链表最后一个元素为：" + cList.last());

        System.out.println("\n旋转后：");
        cList.rotate();
        cList.printNode();

        System.out.println("\n移除第一个元素后：");
        cList.removeFirst();
        cList.printNode();
    }
}