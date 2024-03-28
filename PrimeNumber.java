import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int no,flag=0;
        System.out.println("Enter number ");
        no=sc.nextInt();
        for(int i=2;i<=no/2;i++)
        {
            if(no%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }    
}
