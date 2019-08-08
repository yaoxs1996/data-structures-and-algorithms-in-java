public class Test
{
    public static void main(String[] args)
    {
        char[] data = {'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F'};

        System.out.println("Before sort: ");
        for(char c : data)
        {
            System.out.print(c);
            System.out.print(" ");
        }

        insertSort(data);

        System.out.println("\nAfter sort: ");
        for(char c : data)
        {
            System.out.print(c);
            System.out.print(" ");
        }
    }

    //插入排序
    public static void insertSort(char[] data)
    {
        int n = data.length;
        for(int i=1; i<n; i++)
        {
            char cur = data[i];
            int j = i;
            while(j>0 && data[j-1]>cur)
            {
                data[j] = data[j-1];
                j--;
            }
            data[j] = cur;
        }
    }
}