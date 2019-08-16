public class Test
{
    public static void main(String[] args)
    {
        LinkedPositionalList<String> l = new LinkedPositionalList<>();

        System.out.println("Postional list is empty? " + l.isEmpty());

        l.addFirst("hello");
        l.addLast("world");
    }
}