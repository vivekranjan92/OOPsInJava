
import java.util.Scanner;
public class MaxOccuringChar
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i<n;i++)
        {
           String input = scan.next();
           System.out.println(Max(input.toCharArray()));
        }
    }
    public static char Max(char[] scan)
    {
        int[] charArray = new int[256];
        char result = '\0';
        for(int i =0;i<scan.length;i++)
        {
            int intChar = (int) scan[i];
            charArray[intChar]++;
        }
                
        int Max = -1;
        for(int i = 0;i < charArray.length;i++)
        {
            if(Max<charArray[i])
                {
                    Max = charArray[i];
                    result = (char) i;
                }
        }
           return result;
    }
}