public interface Position<E>
{
    /*返回存储在该位置的元素 */
    E getElement() throws IllegalStateException;
}