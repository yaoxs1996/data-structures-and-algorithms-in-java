public class Test
{
    public static void main(String[] args)
    {
        DoublyLinkedList<String> dList = new DoublyLinkedList<>();

        dList.addFirst("A");
        dList.addFirst("B");
        dList.addFirst("C");
        dList.addFirst("D");

        System.out.println("链表长度为：" + dList.size());
        System.out.println("链表第一个元素为：" + dList.first());
        System.out.println("链表最后一个元素为：" + dList.last());
        
        System.out.println("顺序打印链表：");
        dList.printAZ();
        System.out.println("\n逆序打印链表：");
        dList.printZA();

        System.out.println("\n移除链表的第一个元素" + dList.removeFirst());
        dList.printAZ();
        System.out.println("\n移除链表的最后一个元素" + dList.removeLast());
        dList.printAZ();

        dList.addLast("F");
        System.out.println("\n新增一个元素后：");
        dList.printAZ();
    }
}