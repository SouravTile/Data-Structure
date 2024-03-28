import java.util.Scanner;

public class SecHighest3rdhighest {
    public static void main(String [] args)
    {
        int max,no,nmax,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("max no enter");
        max=sc.nextInt();
        System.out.println("nmax no enter");
        nmax=sc.nextInt();
        if(max<nmax)
        {
            t=max;
            max=nmax;
            nmax=t;
        }
        for(int i=1;i<5;i++)
        {
            System.out.println("Enter "+i+" numbers");
            no=sc.nextInt();
            if(max<no)
            {
                nmax=max;
                max=no;
            }
            else if(nmax<no)
            nmax=no;           
        }
        System.out.println("highest no : "+max+" Second highest no: "+nmax);
    }
}