public interface Queue<E>
{
    /*返回队列中元素的个数 */
    int size();
    /*测试队列是否为空 */
    boolean isEmpty();
    /*向队尾插入元素*/
    void enqueue(E e);
    /*返回，但不移除队列的第一个元素 */
    E first();
    /*移除并返回队列的第一个元素 */
    E dequeue();
}