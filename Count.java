public class Count
{
    private static int count = 0;
    public Count()
    {
        count += 1; 
    }
    public void printCount()
    {
        System.out.println("count = " + count);
    }
}