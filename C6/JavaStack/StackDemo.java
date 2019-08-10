import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        System.out.println("栈是否为空：" + stack.empty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(stack.size() != 0)
        {
            System.out.print(stack.peek());
            System.out.print(" ");
            stack.pop();
        }
    }
}