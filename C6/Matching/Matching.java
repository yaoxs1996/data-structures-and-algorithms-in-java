import java.util.Stack;

public class Matching
{
    /*分隔符匹配 */
    public static boolean isMatched(String expression)
    {
        final String opening = "({[";
        final String closing = ")}]";
        Stack<Character> buffer = new Stack<>();

        for(char c : expression.toCharArray())
        {
            if(opening.indexOf(c) != -1)
            {
                buffer.push(c);
            }
            else if(closing.indexOf(c) != -1)
            {
                if(buffer.isEmpty())
                {
                    return false;
                }
                if(closing.indexOf(c) != opening.indexOf(buffer.pop()))
                {
                    return false;
                }
            }
        }

        return buffer.isEmpty();
    }

    /*HTML标签匹配 */
    public static boolean isHTMLMatching(String html)
    {
        Stack<String> buffer = new Stack<>();
        int j = html.indexOf('<');
        
        while(j != -1)
        {
            int k = html.indexOf('>', j+1);
            if(k == -1)
            {
                return false;
            }
            String tag = html.substring(j+1, k);
            if(!tag.startsWith("/"))
            {
                buffer.push(tag);
            }
            else
            {
                if(buffer.isEmpty())
                {
                    return false;
                }
                if(!tag.substring(1).equals(buffer.pop()))
                {
                    return false;
                }
            }
            j = html.indexOf('<', k+1);
        }
        return buffer.isEmpty();
    }

    public static void main(String[] args)
    {
        String s1 = "()(()){([()])}";
        String s2 = "({[])}";

        System.out.println("s1 is matching? " + isMatched(s1));
        System.out.println("s2 is matching? " + isMatched(s2));
    }
}