public class Test
{
    public static void main(String[] args)
    {
        ArrayList<String> l = new ArrayList<>();

        for(int i=0; i<16; i++)
        {
            l.add(i, Character.toString((char)(65+i)));     //char转String
        }

        l.add(16, "Z");
        
        for(int i=0; i<l.size(); i++)
        {
            System.out.print(l.get(i));
            System.out.print(" ");
        }
    }
}