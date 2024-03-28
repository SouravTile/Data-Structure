import java.util.Scanner;
public class count_occurence {
    public static void main(String [] args)
    {
        int r,n,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int no=sc.nextInt();
        System.out.println("which number ");
        n=sc.nextInt();
        while(no!=0)
        {
            r=no%10;
            if(r==n)
            c++;
            no=no/10;
        }
        System.out.println(n+" digit occured "+c+" timmes");
    }
}
