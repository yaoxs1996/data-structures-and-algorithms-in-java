public class Test
{
    public static void main(String[] args)
    {
        Stack<Integer> S = new LinkedStack<>();
        S.push(5);
        S.push(3);
        S.push(7);
        S.push(4);

        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.top());
    }
}