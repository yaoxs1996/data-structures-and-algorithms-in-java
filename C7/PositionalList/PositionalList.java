public interface PositionalList<E>
{
    /*返回列表的元素个数 */
    int size();

    /*测试是否为空 */
    boolean isEmpty();

    /*返回列表的第一个位置，如果为空返回null */
    Position<E> first();

    /*返回列表的最后一个位置，如果为空返回null */
    Position<E> last();

    /*返回位置p之前的位置，如果p是第一，返回null */
    Position<E> before(Position<E> p) throws IllegalArgumentException;

    /*返回位置p之后的位置，如果p是最后一个，返回null */
    Position<E> after(Position<E> p) throws IllegalArgumentException;

    /*表首插入元素e，并返回位置 */
    Position<E> addFirst(E e);

    /*表尾插入元素e，并返回位置 */
    Position<E> addLast(E e);

    /*在位置p之前插入元素e，并返回e的位置 */
    Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;

    /*在位置p之后插入元素e，并返回e的位置 */
    Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;

    /*替代位置p处的元素，并返回旧元素 */
    E set(Position<E> p, E e) throws IllegalArgumentException;

    /*移除存储在位置p处的元素，并返回 */
    E remove(Position<E> p) throws IllegalArgumentException;
}