import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println( "who many count ");
        int count=sc.nextInt();
        for(int i=1;i<=count;i++)
        {
            System.out.println("Enter the number");
            int n=sc.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum= "+sum);
    }
}
