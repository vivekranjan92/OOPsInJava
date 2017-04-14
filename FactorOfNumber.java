import java.util.Scanner;
public class FactorOfNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of which you want the co factor :-");
        int number = scan.nextInt();

        for(int i = 1;i<=number;i++)
        {
            if(number%i==0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
