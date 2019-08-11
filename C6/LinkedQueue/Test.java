public class Test
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedQueue<>();

        System.out.println("队列当前是否为空：" + q.isEmpty());

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("当前队列队首元素为：" + q.first());
        System.out.println("当前队列长度为：" + q.size());

        q.enqueue(7);
        q.enqueue(6);
        q.dequeue();

        System.out.println("当前队列队首元素为：" + q.first());
        System.out.println("当前队列长度为：" + q.size());
    }
}