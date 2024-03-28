import java.util.Scanner;
public class Armstrong 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,r,temp,sum=0;
        System.out.println("enter 3 digit no: ");
        num=sc.nextInt();
        temp=num;
        
        while(num>0)
        {
            r=num%10;
            num=num/10;
            sum=sum+r*r*r;
        }
        if(temp==sum)
            System.out.println("Armstrong");
        else
            System.out.println("not armstrong");
    }    
}
