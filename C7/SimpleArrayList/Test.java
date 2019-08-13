import java.util.List;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> l = new ArrayList<>();

        System.out.println("List's is empty: " + l.isEmpty());

        for(int i=0; i<16; i++)
        {
            l.add(i, i);
        }

        System.out.println("List's size is: " + l.size());

        l.set(1, 90);
        System.out.println("index 1 is " + l.get(1));
        System.out.println("Remove index 2 is " + l.remove(2));

        for(int i=0; i<l.size(); i++)
        {
            System.out.print(l.get(i));
            System.out.print(" ");
        }
    }
}